import java.util.Scanner;
import java.util.Random;

class starter{
	
	public static void toString(String a){
	String x = a;
	System.out.println(x);
	return;
	}
	
	public static void toStringCombined(String b, String c){
	String y = b;
	String z = c;
	System.out.print(y);
	System.out.print(" ");
	System.out.println(z);
	return;
	}
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Say something.");
	String x = sc.nextLine();
	toString(x);
	
	System.out.println("Say something.");
	String y = sc.nextLine();
	System.out.println("Say something else.");
	String z = sc.nextLine();
	toStringCombined(y,z);
		
	}
}
