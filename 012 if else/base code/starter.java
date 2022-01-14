import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int rand_num = rand.nextInt(1000)+1;
	
	System.out.println("Pick a number between 1 and 1000.");
	int user_num = sc.nextInt();
	
	if(rand_num == user_num)
	{
	System.out.println("CORRECT!");
	System.out.print("The answer is ");
	System.out.println(rand_num);
	}
	
	else
	{
	System.out.println("Wrong");
	}
	
	}
}
