package com.trms.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="deparments")
public class Departments {
/*
 * id serial primary key,
deparment_name varchar not null,
department_head integer references employee(id)
 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="deparment_name")
	private String departmentName;
	@ManyToOne
	@JoinColumn(name="department_head")
	private Employee departmentHead;
	public Departments() {
		this.id = 0;
		this.departmentName = "";
		this.departmentHead = null;
	}
	@Override
	public String toString() {
		return "Departments [id=" + id + ", departmentName=" + departmentName + ", departmentHead=" + departmentHead
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentHead == null) ? 0 : departmentHead.getId().hashCode());
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departments other = (Departments) obj;
		if (departmentHead == null) {
			if (other.departmentHead != null)
				return false;
		} else if (!departmentHead.equals(other.departmentHead))
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Employee getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(Employee departmentHead) {
		this.departmentHead = departmentHead;
	}
}
