package com.htfg.boot.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String employee_name;
	private String employee_age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employee_name + ", employee_age=" + employee_age + "]";
	}
	public Employee(Integer id, String employee_name, String employee_age) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_age = employee_age;
	}
	public Employee() {
		super();
	}
}
