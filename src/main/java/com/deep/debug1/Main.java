package com.deep.debug1;

import java.util.*;

/**
 * @author Deep
 * @create 2022-11-28
 */
public class Main {
	public static void main(String[] args) {
		Map<Integer, Dog> dogMap = new HashMap<>();
		Map<Integer, Cat> catMap = new HashMap<>();
		Random random = new Random(100);
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int anInt = random.nextInt()%2;
			User user = new User();
			user.setName("张三");
			Dog dog = new Dog(user.getName() +i+ "的dog", anInt);
			dogMap.put(anInt, dog);
			user.setDog(dogMap.get(anInt));

			Cat cat = new Cat(user.getName() + i+"的cat", anInt);
			catMap.put(anInt,cat);
			user.setCat(catMap.get(anInt));
			users.add(user);
		}
		/*// 1
		User user = new User();
		user.setName("张三");
		Dog dog = new Dog(user.getName() + "的dog", 5);
		dogMap.put(1, dog);
		user.setDog(dogMap.get(1));

		Cat cat = new Cat(user.getName() + "的cat", 5);
		catMap.put(1,cat);
		user.setCat(catMap.get(1));

		// 2
		User user1 = new User();
		user1.setName("李四");
		Dog dog1 = new Dog(user1.getName()+"的dog",1);
		dogMap.put(2,dog1);
		user1.setDog(dogMap.get(2));

		Cat cat1 = new Cat(user1.getName() + "的cat", 1);
		catMap.put(2, cat1);
		user1.setCat(catMap.get(2));

		// 3
		User user2 = new User();
		user2.setName("王五");
//		Dog dog2 = new Dog(user.getName() + "的dog", 2);
//		dogMap.put(1, dog2);
		user2.setDog(dogMap.get(1));

//		Cat cat2 = new Cat(user.getName() + "的cat", 2);
//		catMap.put(1,cat2);
		user2.setCat(catMap.get(1));*/

//		List<User> users = new ArrayList<>();
//		users.add(user);
//		users.add(user1);
//		users.add(user2);
//		System.out.println(users);
//		for (int i = 0; i < users.size(); i++) {
//			System.out.println(users.get(i));
//		}

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

//		System.out.println(users);
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
}
