package com.student;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	 double avg=marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public double avrageMarks(int length) {
//		avg=(avg+marks)/length;
//		
//		return avg;
//		
//	}
	

	public int getRoll()
	{
		return roll;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

     public void setMarks(int marks)
    {
		
		
		this.marks = marks;
	}



//gettermethod
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}

	
	public int getMarks() {
		return marks;
	}

	
	
	
	
	
	

}
