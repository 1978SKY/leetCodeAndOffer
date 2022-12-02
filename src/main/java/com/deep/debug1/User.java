package com.deep.debug1;

/**
 * @author Deep
 * @create 2022-11-28
 */
public class User {
	private String name;
	private Cat cat;
	private Dog dog;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
