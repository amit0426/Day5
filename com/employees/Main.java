package com.employees;
import java.util.*;
public class Main
{
	

	public static void main(String[] args) 
	{

		Employee e=new Employee();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id : ");

		e.setEmployeeId(sc.nextInt());
		
		System.out.println("enter name : ");

		e.setEmployeeName(sc.next());
		
		System.out.println("enter Salary : ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("enter pf percent : ");

		e.calculateNetSalary(sc.nextInt());
		
		System.out.println("Employee details: ");


		
		System.out.println("Id is :"+e.getEmployeeId());
		System.out.println("Name is :"+e.getEmployeeName());
		System.out.println("Net Salary is :"+e.getNetSalary());
		
	
	}


}
