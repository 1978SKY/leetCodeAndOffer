package com.deep.debug;

/**
 * @author Deep
 * @create 2022-11-28
 */
public class Cat {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public Cat(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
