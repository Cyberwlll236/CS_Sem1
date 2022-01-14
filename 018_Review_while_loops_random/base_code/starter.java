import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Let's play a game.");
	System.out.println("I'm going to pick a number between 1 and 1000 and you need to guess it.");
	int rand_num = rand.nextInt(1000)+1;
	System.out.println("OK, start guessing.");
	int user_num;
	
	while(true)
	{
	user_num = 	sc.nextInt();
	if(user_num == rand_num)
	{
		break;
	}
	if(user_num != rand_num)
	{
		System.out.println("Not quite. Try again.");
	}
	}

	System.out.println("Congratulations. You won.");
	
	
	
	
		
	}
}
