package com.deep;

/**
 * @author Deep
 * @create 2022-09-06
 */
public class User {
	private String name;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setName("zh");
		User user1 = new User();
		copy(user,user1);
		System.out.println(user.getName());
	}
	private static void copy(User s,User t){
		t.setName(s.getName());
	}
}
