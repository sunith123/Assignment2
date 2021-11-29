package com.example.ass5.ASS5.model;

import org.springframework.data.annotation.Id;

public class Employee {
	@Id
	private String id;
	private String name;
	private String dep;
	private String des;
	private String sal;
	public Employee(String id, String name, String dep, String des, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.des = des;
		this.sal = sal;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDep() {
		return dep;
	}
	public String getDes() {
		return des;
	}
	public String getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + ", des=" + des + ", sal=" + sal + "]";
	}
	

}
