package com.employees;

public class Employee
{


	private  int  employeeId;
	private  String employeeName;
	private  double salary;
	private  double netSalary;
	
	public Employee()
	{
		super();
	}
	
	
	public void calculateNetSalary(int pfpercentage)
	{
		double  pfamnt=(salary*pfpercentage)/100;
		netSalary=salary-pfamnt;
	}
//	setmethod****************************************
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public void setNetSalary(double netSalary) 
	{
		this.netSalary = netSalary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
//	getmethod****************************************
	
	public int getEmployeeId() 
	{
		return employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public double getSalary()
	{
		return salary;
	}
	
	public double getNetSalary() 
	{
		return netSalary;
	}
	
	
	
	
	
//	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.salary = salary;
//		this.netSalary = netSalary;
//	}
	

	

}



