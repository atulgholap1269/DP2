package selflearning;

import java.util.Scanner;

public class SelfPractice {


	public static void main(String[] args) {
    // write code check number is duck or not
   //number which contain 1 digit as 0 but does not start with zero
//    Scanner sc = new Scanner (System.in);
//    System.out.println("enter number");
//     int num = sc.nextInt();
		int x=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print(k);
			}
			for(int l=i;l>=1;l--)
			{
				if(x==1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(l);
				}x++;
				
			}
			System.out.println();
		}

  
	}
}
