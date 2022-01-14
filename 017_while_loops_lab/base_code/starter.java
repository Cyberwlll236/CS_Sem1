import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What name would you like me to loop?");
	String name = sc.nextLine();
	System.out.println("How many times should I say it?");
	int num = sc.nextInt();
	int c = 1;
	
	while(true)
	{
	System.out.println(name);
	
	if(c==num)
	{
		break;
	}
	
	c=c+1;
	}
	
	}
}
