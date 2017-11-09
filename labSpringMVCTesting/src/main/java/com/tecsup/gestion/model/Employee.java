package com.tecsup.gestion.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Employee {

	int employeeId;

	@NotEmpty
	String login;

	@NotEmpty
	String password;

	@NotEmpty
	String firstname;

	@NotEmpty
	String lastname;
		
	@Range(min = 1, max = 5000)
	int salary;

	/**
	 * 
	 * @param login
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @param salary
	 */
	public Employee(String login, String password, String firstname, String lastname, int salary) {
		super();
		this.login = login;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeID) {
		this.employeeId = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [login=" + login + ", password=" + password + ", employeeId=" + employeeId + ", firstname="
				+ firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
	}

}
