package com.deep.string;

import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @author Deep
 * @create 2022-12-07
 */
public class StringTest {
	public static void main(String[] args) {

		// filterApplicableScope
		System.out.println(filterApplicableScope("",null));
		System.out.println(filterApplicableScope(null,null));
		System.out.println(filterApplicableScope("1;2",3));


		System.out.println("==================");

		// filterApplicableScopeSpecial

		System.out.println(filterApplicableScopeSpecial("1;2;3", Arrays.asList("1;2".split(";"))));
		System.out.println(filterApplicableScopeSpecial("1", Arrays.asList("1;2".split(";"))));


		System.out.println(filterApplicableScopeSpecial("", Arrays.asList("1;2".split(";"))));
		System.out.println(filterApplicableScopeSpecial("1;3;4", Arrays.asList("2".split(";"))));
	}

	/**
	 * 适用范围过滤工具
	 *
	 * @param applicableScopes 适用范围（为空时表示全部适用）
	 * @param target           目标范围
	 * @return true：过滤，false：不过滤（适用范围不为空且不包含目标时进行过滤）
	 */
	public static boolean filterApplicableScope(String applicableScopes, Integer target) {
		// 为空时表示所有范围都适用，不过滤
		if (StrUtil.isBlank(applicableScopes)) {
			return false;
		}
		List<String> scopes = Arrays.asList(applicableScopes.split(";"));
		return !scopes.contains(String.valueOf(target));
	}

	/**
	 * 适用范围多场景过滤工具
	 *
	 * @param applicableScopes 适用范围
	 * @param targets          目标范围集合
	 * @return true：过滤，false：不过滤（适用范围不为空且不包含目标时进行过滤）
	 */
	public static boolean filterApplicableScopeSpecial(String applicableScopes, List<String> targets) {
		// 为空时表示所有范围都适用，不过滤
		if (StrUtil.isBlank(applicableScopes)) {
			return false;
		}
		String[] scopes = applicableScopes.split(";");
		for (String scope : scopes) {
			if (targets.contains(scope)) {
				return false;
			}
		}
		return true;
	}

//	/**
//	 * 适用范围多场景过滤工具
//	 * @param applicableScopes 适用范围
//	 * @param targets 目标范围集合
//	 * @return true：过滤，false：不过滤（适用范围不为空且不包含目标时进行过滤）
//	 */
//	public static boolean filterApplicableScopeSpecial(String applicableScopes, List<String> targets){
//		if(StrUtil.isBlank(applicableScopes)){
//			return false;
//		}
//		String[] scopes = applicableScopes.split(";");
//		for (String scope : scopes) {
//			if(targets.contains(scope)){
//				return false;
//			}
//		}
//		return true;
//	}
}
