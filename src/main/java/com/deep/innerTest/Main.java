package com.deep.innerTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create 2022-12-28
 */
public class Main {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		for (int i = 0; i <5; i++) {
			User user = new User();
			ArrayList<Integer> ages = new ArrayList<>();
			ages.add(1);
			ages.add(2);
			ages.add(3);
			user.setAges(ages);
			users.add(user);
		}
		System.out.println(users);

		for (User user : users) {
			List<Integer> ages = user.getAges();
			ages.removeIf(item-> item==2);
			user.setAges(ages);
		}

		System.out.println(users);


	}

	public static class User{
		public List<Integer> getAges() {
			return ages;
		}

		public void setAges(List<Integer> ages) {
			this.ages = ages;
		}

		private List<Integer> ages;

		@Override
		public String toString() {
			return "User{" +
					"ages=" + ages +
					'}';
		}
	}
}
