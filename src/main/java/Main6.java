import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Deep
 * @create 2022-09-25
 */
public class Main6 {
	public static void main(String[] args) {
		// 获取树的深度
//		getTreeDeep(root);
	}

	/**
	 * 打印树的深度（采用层序遍历的方式亦可求出树的深度，即树的层树为树的深度）
	 */
	private static int getTreeDeep(Tree root) {
		// 存储每层树的节点
		Deque<Tree> deque = new LinkedList<>();
		deque.add(root);
		// 树的深度
		int deep = 0;
		while (!deque.isEmpty()) {
			// 记录当前层树的节点个数
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				Tree cur = deque.removeFirst();
				if(cur.left!=null){
					deque.addLast(cur.right);
				}
				if (cur.right!=null){
					deque.addLast(cur.right);
				}
			}
			// 深度++
			deep++;
		}
		return deep;
	}


	private static class Tree {
		private int value;
		private Tree left;
		private Tree right;
	}
}
