package com.ticket;

public class Ticket
{
	
	private int ticketid;
	private int price;
	private int availableTickets;
	public Ticket()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int calculateTicketCost(int nooftickets)
	{
		if(availableTickets>0 && availableTickets>nooftickets)
		{
			int aT=availableTickets-nooftickets;
			availableTickets=aT;
			int amnt=nooftickets*price;
			return amnt;
		}
		return -1;

		
	}
	
//	setmethod******************************************
	public void setTicketid(int i) 
	{
		this.ticketid = ticketid;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public void setAvailableTickets(int availableTickets)
	{
		this.availableTickets = availableTickets;
	}
	
	
//	getmetthod?**************************************
	
	public int getTicketid() 
	{
		return ticketid;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public int getAvailableTickets() 
	{
		return availableTickets;
	}
	
	
	
	
	
	

}
