package com.tutorial.controller;

public class Student {

	int id ;
	String name;
	int age;
	String dept;
	
	public Student(int id, String name, int age, String dept) {
		
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		System.out.println("costructor calling !!");
	}
	public Student() {
		super();
		System.out.println("student class calling !!");
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter calling");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	
}
