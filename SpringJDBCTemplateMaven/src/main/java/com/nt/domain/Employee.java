package com.nt.domain;

public class Employee {
	
	private int empno;
	private String name;
private String salary;
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
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
}


}
