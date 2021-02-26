package com.trms.models;

public class Employee {
/*
 * id serial primary key,
first_name varchar not null,
last_name varchar not null,
username varchar not null,
pass varchar not null,
reimbursement_claimed numeric,
direct_supervisor integer references employee(id),
department integer references departments(id)
 */
	private Integer id;
	private String firstName;
	private String lastName;
	private String username;
	private String pass;
	private Float reimbursementClaimed;
	private Integer directSupervisor;
	private Integer department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Float getReimbursementClaimed() {
		return reimbursementClaimed;
	}
	public void setReimbursementClaimed(Float reimbursementClaimed) {
		this.reimbursementClaimed = reimbursementClaimed;
	}
	public Integer getDirectSupervisor() {
		return directSupervisor;
	}
	public void setDirectSupervisor(Integer directSupervisor) {
		this.directSupervisor = directSupervisor;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
}
