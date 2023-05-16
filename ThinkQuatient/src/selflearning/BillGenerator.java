package selflearning;

import java.util.Scanner;

public class BillGenerator {
	public static void main(String[] args) {
		
		int pizzaPrice=100;
		int puffsPrize=20;
		int coldPrize=10;
		char ch;
		do {
		Scanner sc =new Scanner (System.in);
		System.out.println("Entre no of pizza");
		int noPizza=sc.nextInt();
		System.out.println("Entre no of puffs");
		int noPuffs=sc.nextInt();
		System.out.println("Entre no of colddrink");
		int noCold=sc.nextInt();
		
		System.out.println("Bill Details:");
		System.out.println("No of pizzas:"+noPizza);
		System.out.println("No of puffs:"+noPuffs);
		System.out.println("No of cloddrinks :"+noCold);
		System.out.println("Total Price :"+((noPizza*pizzaPrice)+(noPuffs*puffsPrize)+(noCold*coldPrize)));
		System.out.println("Enjoy the show");
		System.out.println("===========================");
		System.out.println("Do you want to continue order");
		 ch=sc.next().charAt(0);
		}
		while(ch=='y'|| ch=='Y');
	}

}
