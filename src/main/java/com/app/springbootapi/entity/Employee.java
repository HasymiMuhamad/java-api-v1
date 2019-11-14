package com.app.springbootapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name= "designation")
	private String designation;

}
