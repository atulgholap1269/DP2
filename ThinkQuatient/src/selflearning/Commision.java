package selflearning;

import java.util.Scanner;

public class Commision {
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter total amount");
				int amount=sc.nextInt();	
				if(amount>=2000)
				{
					System.out.println("discount amount is :"+(amount*0.05));
				}
				else
				{
					System.out.println("not applicable for discount");
				}
		}
	}

}
