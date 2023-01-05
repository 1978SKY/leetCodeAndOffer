package com.deep.innerTest;

import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @author Deep
 * @create 2022-12-28
 */
public class FilterUtil {
	public static boolean applicableScopeFilter(String applicableScopes, String target) {
		if (StrUtil.isBlank(applicableScopes)) {
			return true;
		}
		List<String> scopes = Arrays.asList(applicableScopes.split(";"));
		return !scopes.contains("0") && !scopes.contains(target);
	}
}
