package com.khadijaMamAss;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public static int getAvailableTickets()
	{
		return availableTickets;
		
	}
	public int getPrice() {
		return price;
		
	}
	public int getTicketid() {
		return ticketid;
	}
	public static void setAvailableTickets(int availableTickets) 
	{
		if(availableTickets>0)
		{
		Ticket.availableTickets = availableTickets;
		}
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
    public int calculateTicketCost(int noOfTickets) {
    int ticketCost=0;
        
    	if(Ticket.getAvailableTickets()>=noOfTickets)
    	{
    	System.out.println("Available tickets: "+Ticket.getAvailableTickets());
    		
    	 ticketCost=noOfTickets*this.getPrice();
    	 System.out.println("Total Amount : "+ticketCost);
    	Ticket.setAvailableTickets(Ticket.getAvailableTickets()-noOfTickets);
    	System.out.println("Available tickets after booking : "+Ticket.getAvailableTickets());
    	}
    	else
    	{
    		Ticket.setAvailableTickets(-1);
    		return Ticket.getAvailableTickets();
    	}
    	return ticketCost;
    }
}

