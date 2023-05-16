package selflearning;

public class Pattern2 {
//1  2  3  4  5
//2  4  6  8  10
//3  6  9  12  15
//4  8  12 15  18
//5  10 15 20  25
	int n=5;
	public void desplayTable()
	{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.printf("%3d",i*j);
		}
		System.out.println();
	}
	}
	public static void main(String[] args) 
	{
		Pattern2 obj= new Pattern2();
		obj.desplayTable();
	}
}
