package com.mph.controller;

import java.io.IOException;
import java.util.List;

import com.mph.model.Employee;

public interface EmployeeControllerInterface {
	public List<Employee> addEmployee();
	public void serializeEmp(List elist) ;
	public void deSerializeEmp( List elist) ;
	public void sortEmpDetails( List list);
	public void viewEmployee(List empList);
	
}
