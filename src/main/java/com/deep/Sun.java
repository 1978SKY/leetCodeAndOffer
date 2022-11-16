package com.deep;

/**
 * @author Deep
 * @create 2022-09-16
 */
public class Sun extends Father{
	static {
		System.out.println("sun static...");
	}

	public Sun() {
		System.out.println("sun 构造器...");
	}


	public static void main(String[] args) {
		new Sun();
	}
}
