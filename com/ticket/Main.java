package com.ticket;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ticket t= new Ticket();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of bookings : ");
		int nb=sc.nextInt();
		
		System.out.println("Ticket available : ");
		t.setAvailableTickets(sc.nextInt());
		
		for(int i=1; i<=nb; i++) {
			System.out.println("Ticket Id: "+i);
			t.setTicketid(sc.nextInt());
			
			System.out.println("Ticket price : ");
			t.setPrice(sc.nextInt());
			System.out.println("number of ticket : ");
			System.out.println("total amount :"+t.calculateTicketCost(sc.nextInt()));
			
			System.out.println("Ticket details: ");

			System.out.println("Id is :"+t.getTicketid());
			System.out.println("Available is :"+t.getAvailableTickets());
			System.out.println("total price   is :"+t.getPrice());
		}
		
		
		
		
		

	}

}
