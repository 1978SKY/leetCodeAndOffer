package com.deep.debug;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create 2022-11-28
 */
public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("张三");
		Dog dog = new Dog(user.getName() + "的dog", 2);
		user.setDog(dog);
//		Cat cat = new Cat(user.getName() + "的cat", 3);
//		user.setCat(cat);

		User user1 = new User();
		user1.setName("李四");
//		Dog dog1 = new Dog(user1.getName()+"的dog",1);
//		user1.setDog(dog1);
		Cat cat1 = new Cat(user1.getName() + "的cat", 4);
		user1.setCat(cat1);

		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		System.out.println(users);

		users.sort((o1, o2) -> {
			int age1, age2;
			if (o1.getDog() != null) {
				age1 = o1.getDog().getAge();
			} else {
				age1 = o1.getCat().getAge();
			}
			if (o2.getDog() != null) {
				age2 = o2.getDog().getAge();
			} else {
				age2 = o2.getCat().getAge();
			}
			return Integer.compare(age1, age2);
		});

		System.out.println(users);
	}
}
