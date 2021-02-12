package com.dojo.web.models;

public class Player {
	private String name;
	private String lastname;
	private Integer age;



	public Player() {

	}
	public Player(String name, String lastname, Integer age) {

		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
