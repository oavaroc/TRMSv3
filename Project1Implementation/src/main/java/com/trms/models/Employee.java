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
}
