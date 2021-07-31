package com.mph.controller;

import java.io.*;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mph.model.Employee;
public class EmployeeController implements EmployeeControllerInterface{
	Employee emp;
	List<Employee> empList = new ArrayList<>();
    
	public List<Employee> addEmployee() {
		emp = new Employee();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your name :");
		emp.setEname(sc.next());
		
		System.out.println("Enter your Department :");
		emp.setDept(sc.next());
		
		empList.add(emp);
		return empList;
	}

	public void serializeEmp(List elist)  {
		
	}

	public void deSerializeEmp( List elist)  {
		
	}

	public void sortEmpDetails( List list) {
		System.out.println("Sorted function under progress");	
	}

	public void viewEmployee(List empList) {
		System.out.println("Employee details:");
		empList.forEach(System.out::println);
	}
}

