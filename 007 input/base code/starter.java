import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String text1 = sc.nextLine();
		
		System.out.println("How old are you?");
		int numberA = sc.nextInt();
		
		System.out.println("What month were you born?");
		String text2 = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("What day were you born?");
		int numberB = sc.nextInt();
		
		System.out.println("What year were you born?");
		int numberC = sc.nextInt();
		
		System.out.println("How much is a dollar fifty?");
		double number = sc.nextDouble();

	}
}
