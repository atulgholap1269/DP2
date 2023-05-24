package selflearning;
//112131
//122232
//132333
//142434
//152535
public class Pattern3 {
	int n=5;int k;
	public void displayNumber()
	{
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+""+i+"");
			}
			System.out.println();
		}
	}
	//111213
	//212223
	//313233
	//414243
	//515253
	
	public void displayNumber1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(i+""+j+"");
			}
			System.out.println();
		}
	}
	//1  6  11  16  21
	//2  7  12  17  22
	//3  8  13  18  23
	//4  9  14  19  24
	//5  10 15  20  25
	public void displayNumber2()
	{
		int x;
		for(int i=1;i<=n;i++)
		{
			x=i;
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%3d",x);
				x+=5;;
			}
			System.out.println();
		}
	}
	
     public static void main(String[] args) {
    	 Pattern3 obj = new Pattern3();
    	 obj.displayNumber2();
	}

}
