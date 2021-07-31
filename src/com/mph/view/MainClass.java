package com.mph.view;

import java.util.List;
import java.util.Scanner;
import java.io.*;
import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeControllerInterface;

public class MainClass{

	public static void main(String[] args) {
		System.out.println("Welcome To EMS!!!");
		EmployeeControllerInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		List elist = null;
		
		while(true) {
			System.out.println("Enter your Choice:");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. serialized");
			System.out.println("4. deserialized");
			System.out.println("5. sort by name");
			System.out.println("6. sort by Dept");
			System.out.println("7. Exit");
			int choice = sc.nextInt();
	
			switch (choice) {
			case 1:  elist=ec.addEmployee(); break;
			case 2:  ec.viewEmployee(elist); break;
			case 3:  ec.serializeEmp(elist); break;
			case 4:  ec.deSerializeEmp(elist); break;
			case 5:  ec.sortEmpDetails(elist); break;
			case 6 : System.exit(0);			
			default: System.out.println("Wrong Option selected");
			}
		}
	}
}
