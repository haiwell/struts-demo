package com.struts.base.entity;

public class User {

	private int age;
	public static String name = "aaa";

	public User() {
	}

	public User(int uid) {
		this.age = uid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User_" + age;
	}

	public String shuohua() {
		return "说话";
	}

	public static String getName() {
		return name;
	}

}
