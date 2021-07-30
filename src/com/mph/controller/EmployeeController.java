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
public abstract class EmployeeController {
Employee emp;
	List<Employee> empList = new ArrayList<>();
     public List<Employee> addEmployee() {
		emp = new Employee();

		
       @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your name :");
		emp.setEmpname(sc.next());


		System.out.println("Enter your Department :");
		emp.setDept(sc.next());
		empList.add(emp);
		return empList;

	}

	public void serializeEmp(@SuppressWarnings("rawtypes") List elist) throws IOException {
		

	}

	public void deSerializeEmp(@SuppressWarnings("rawtypes") List elist) throws Exception {

		

	}

	@SuppressWarnings("unchecked")
	public void sortEmpDetails(@SuppressWarnings("rawtypes") List list) {
		System.out.println("Sorted function under progress");
		
	}

	@SuppressWarnings("unchecked")
	public void viewEmployee(@SuppressWarnings("rawtypes") List empList) {
		System.out.println("Employee details:");
		empList.forEach(System.out::println);
	}

	
}

