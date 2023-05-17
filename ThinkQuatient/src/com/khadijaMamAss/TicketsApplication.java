package com.khadijaMamAss;

import java.util.Scanner;

public class TicketsApplication {
	public static void main(String[] args) {
		Ticket obj = new Ticket();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Booking:");
		int booking = sc.nextInt();
		
		
		
		System.out.println("Enetr Ticket Id:");
		int ticketIds=sc.nextInt();
		obj.setTicketid(ticketIds);
		
		System.out.println("Enter the price:");
		int price1= sc.nextInt();
		obj.setPrice(price1);
		
		System.out.println("Enter the available tickets:");
		int tickets= sc.nextInt();
		Ticket.setAvailableTickets(tickets);
	//	do
	//	{
		System.out.println("Enter number of tickets:");
		int numOfTickets=sc.nextInt();
		System.out.println(obj.calculateTicketCost(numOfTickets));
		//}while(Ticket.getAvailableTickets()>0);
		
	}

}
