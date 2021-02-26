package com.trms.models;

public class Departments {
/*
 * id serial primary key,
deparment_name varchar not null,
department_head integer references employee(id)
 */
	private Integer id;
	private String departmentName;
	private Integer departmentHead;
}
