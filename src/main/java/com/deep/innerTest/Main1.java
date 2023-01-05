package com.deep.innerTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create 2022-12-28
 */
public class Main1 {
	public static void main(String[] args) {
		String applicableScope = "1;2;3";
		User user = new User();
		user.setApplicableScope("1;2;3");
		User user1 = new User();
		user1.setApplicableScope("0;4;5;6");
		User user2 = new User();
		user2.setApplicableScope("1;2");
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.removeIf(item-> FilterUtil.applicableScopeFilter(item.getApplicableScope(), "1"));
		System.out.println(users);
	}

	public static class User{
		private String applicableScope;

		public String getApplicableScope() {
			return applicableScope;
		}

		public void setApplicableScope(String applicableScope) {
			this.applicableScope = applicableScope;
		}

		@Override
		public String toString() {
			return "User{" +
					"applicableScope='" + applicableScope + '\'' +
					'}';
		}
	}
}
