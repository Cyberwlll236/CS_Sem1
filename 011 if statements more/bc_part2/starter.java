import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me three numbers.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3))
		{
		System.out.print(num1);
		System.out.println(" is the greatest.");
		}
		
		if((num2 > num1) && (num2 > num3))
		{
		System.out.print(num2);
		System.out.println(" is the greatest.");
		}
		
		if((num3 > num1) && (num3 > num2))
		{
		System.out.print(num3);
		System.out.println(" is the greatest");
		}
		
		if((num1 < num2) && (num1 < num3))
		{
		System.out.print(num1);
		System.out.println(" is the smallest.");
		}
		
		if((num2 < num1) && (num2 < num3))
		{
		System.out.print(num2);
		System.out.println(" is the smallest.");
		}
		
		if((num3 < num1) && (num3 < num2))
		{
		System.out.print(num3);
		System.out.println(" is the smallest");
		}
		
	}
}
