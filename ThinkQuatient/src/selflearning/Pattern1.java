package selflearning;
//1  3  5  7  9
//11 13 15 17 19
//21 23 25 27 29
//31 33 35 37 39
public class Pattern1 {
	int n=2; int k=5;
	public void displayNumber()
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.printf("%3d",n);
				n+=2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern1 obj =new Pattern1();
		obj.displayNumber();
	}
	

}
