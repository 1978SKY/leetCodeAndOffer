package com.deep.objects;

import java.util.Objects;

/**
 * @author Deep
 * @create 2022-12-29
 */
public class ObjectEquals {
	public static void main(String[] args) {
		System.out.println(Objects.equals(null,null));
		System.out.println(null==null);
		System.out.println(Objects.equals(0, 0));
		System.out.println(Objects.equals(1,0));
		System.out.println(Objects.equals(0,0));


		System.out.println(numberNotZero(null));
		System.out.println(numberNotZero(1));
		System.out.println(numberNotZero(0));
	}

	public static boolean numberNotZero(Integer num1) {
		if (Objects.isNull(num1)) {
			return false;
		}
		return !Objects.equals(num1,0);
	}
}
