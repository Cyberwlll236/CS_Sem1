import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Are you a wizard, a warrior, or a rogue?");
	String user_role = sc.nextLine();

	if((user_role.equals("wizard")) || (user_role.equals("Wizard")))
	{
	System.out.println("You are a wizard.");
	}

	else if((user_role.equals("warrior")) || (user_role.equals("Warrior")))
	{
	System.out.println("You are a warrior.");
	}

	else if((user_role.equals("rogue")) || (user_role.equals("Rogue")))
	{
	System.out.println("You are a rogue.");
	}

	}
}
