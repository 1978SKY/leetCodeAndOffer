package com.deep.test;

/**
 * @author Deep
 * @create 2022-10-17
 */
public class TryFinallyTest {


	public static void main(String[] args) {
		boolean test = getBoolTest();
		System.out.println("test..." + test);
	}

	private static boolean getBoolTest() {
		try {
			return getBool();
		} finally {
			System.out.println("finally...");
		}
	}

	private static boolean getBool() {
		System.out.println("true...");
		return true;
	}
}
