package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_SYSTEM")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;
  private String address;
  private String email;
  private String phoneNo;
  private int salary;
  
  
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneNo="
			+ phoneNo + ", salary=" + salary + "]";
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
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
  
}
