package com.deep.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create 2022-12-16
 */
public class StreamTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		System.out.println("-----------");
		list.forEach(item -> {
			System.out.print("....");
		});

		System.out.println("==========");

		List<Integer> list1 = null;
		list1.forEach(item -> System.out.print("..."));
	}
}
