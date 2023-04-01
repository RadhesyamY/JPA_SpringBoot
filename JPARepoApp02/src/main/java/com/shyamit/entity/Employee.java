package com.shyamit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ Entity
@ Table (name="Emp_tbl")
@ Data
@ AllArgsConstructor
@ NoArgsConstructor
public class Employee {
	
	@ Id
	private Integer empID;
	private String empName;
	private Double empSal;
	private String empGender;
	private String dept;

}
