import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("What is you name?");
	String name = sc.nextLine();

	System.out.println("And your title?");
	String title = sc.nextLine();
	
	System.out.println("Are you a wizard, a warrior, or a rogue?");
	String  role = sc.nextLine();
	
	
	if((role.equals("wizard")) || (role.equals("Wizard")) || (role.equals("a wizard")))
	{
	System.out.println("You are a wizard.");
	}

	else if((role.equals("warrior")) || (role.equals("Warrior")) || (role.equals("a warrior")))
	{
	System.out.println("You are a warrior.");
	}

	else if((role.equals("rogue")) || (role.equals("Rogue")) || (role.equals("a rogue")))
	{
	System.out.println("You are a rogue.");
	}

	System.out.println("What would you like your stats to be?");
	System.out.println("You can spread 25 points across Strength, Dexterity, Wisdom, Constitution, and Charisma.");
	System.out.println("No single stat can go over 10 points.");
	
	int remainpts = 25;

	System.out.println("What is your Strength?");
	int Str = sc.nextInt();
	if((Str > 10) || (remainpts-Str < 0))
	{
	System.out.println("That stat is too high. Try again.");
	Str = sc.nextInt();
	}
	if((Str <= 10) && (remainpts >= 0))
	{
	System.out.print("You have ");
	System.out.print(remainpts-Str);
	System.out.println(" points left");
	System.out.println("What is your Dexterity?");
	int Dex = sc.nextInt();
	if((Dex > 10) || (remainpts-Str-Dex < 0))
	{
	System.out.println("That stat is too high. Try again.");
	Dex = sc.nextInt();
	}
	
	if((Dex <= 10) && (remainpts-Str-Dex >= 0))
	{
	System.out.print("You have ");
	System.out.print(remainpts-Str-Dex);
	System.out.println(" points left");
	System.out.println("What is your Wisdom?");
	int Wis = sc.nextInt();
	if((Wis > 10) || (remainpts-Str-Dex-Wis < 0))
	{
	System.out.println("That stat is too high. Try again.");
	Wis = sc.nextInt();
	}
	
	if((Wis <= 10) && (remainpts-Str-Dex-Wis >= 0))
	{
	System.out.print("You have ");
	System.out.print(remainpts-Str-Dex-Wis);
	System.out.println(" points left");
	System.out.println("What is your Constitution?");
	int Con = sc.nextInt();
	if((Con > 10) || (remainpts-Str-Dex-Wis-Con < 0))
	{
	System.out.println("That stat is too high. Try again.");
	Con = sc.nextInt();
	}
	
	if((Con <= 10) && (remainpts-Str-Dex-Wis-Con >= 0))
	{
	System.out.print("You have ");
	System.out.print(remainpts-Str-Dex-Wis-Con);
	System.out.println(" points left");
	System.out.println("Lastly, what is your Charisma?");
	int Cha = sc.nextInt();
	if((Cha > 10) || (remainpts-Str-Dex-Wis-Con-Cha < 0))
	{
	System.out.println("That stat is too high. Try again.");
	Cha = sc.nextInt();
	}
	
	if((Cha <= 10) && (remainpts-Str-Dex-Wis-Con-Cha >= 0))
	{
	System.out.print("Your are ");
	System.out.print(name);
	System.out.print(" ");
	System.out.print(title);
	System.out.print(".");
	System.out.print("You are a ");
	System.out.println(role);
	System.out.println("Your stats are:");
	System.out.print("Str=");
	System.out.println(Str);
	System.out.print("Dex=");
	System.out.println(Dex);
	System.out.print("Wis=");
	System.out.println(Wis);
	System.out.print("Con=");
	System.out.println(Con);
	System.out.print("Cha=");
	System.out.println(Cha);
	System.out.println();
	System.out.println("Congratulations on creating your character.");
	}}}}}
	
	
	
	
	
	
	
	}
}
