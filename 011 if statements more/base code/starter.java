import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me two numbers.");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if(number1 != number2)
		{
		System.out.println("They are different.");
		}
		
		if(number1 == number2)
		{
		System.out.println("They are equal.");
		}
		
		
		
	}
}
