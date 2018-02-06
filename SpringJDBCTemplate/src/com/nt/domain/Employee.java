package com.nt.domain;

public class Employee {
	
	private int empno;
	private String name;
private int salary;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
}


}
