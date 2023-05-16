package selflearning;

public class SimpleIf {
	public static void main(String[] args) {
		int age =23;
		// simple if else statement
		if(age>20)
		{
			System.out.println("you are an adult");
		}
		else
		{
			 System.out.println("you are a kid");
		}
		// ladder statement
		if(age>20)
		{
			System.out.println("you are an adult");
		}
		else if(age>5)
		{
			System.out.println("You are not a kid");
		}
		else
		{
			System.out.println("you are a kid");
		}
		
		
	}
	

}
