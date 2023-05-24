package selflearning;

public class LearnString {
	public static void main(String[] args) {
		String str ="My name is Atul";
		String surname = "gholap";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str+" Banshi "+surname);
		System.out.println(str+"from \\");
		System.out.println(str+"from \t"+ surname);
		System.out.println(str+"from \n"+surname);
		System.out.println(str.startsWith("M"));//checks starting character
		System.out.println(str.contains("am"));// checks given word contain in string or not
		System.out.println(str.endsWith("l"));// check end character
		System.out.println(str.charAt(5));// check charcter at index
		System.out.println(str.indexOf("is"));// get index given word from string
		
		int num1=4, num2=7;
		System.out.println(Math.max(num1, num2));// get max number from given
		System.out.println(Math.min(num1, num2));//get min number from given
		System.out.println(Math.sqrt(36));// get sqaure root of given num
		System.out.println(Math.abs(-8));//to change sign of number
		System.out.println(Math.abs(9));
		System.out.println(Math.random());// to get random number every time
		System.out.println(4+(10-4)*Math.random());// to get random number from 4 to  10
		System.out.println(4+(10-4)*Math.random());
		System.out.println(4+(10-4)*Math.random());
	}
}