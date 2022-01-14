import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int $ = 100;
	int wager;
	int slot1 = 0;
	int slot2 = 0;
	int slot3 = 0;
	String yn = new String("placeholder");
	System.out.println("Welcome to Mr. Poole's amazing slot machine.");
	System.out.println("Lets get started.");
	System.out.println("You have $" + $ + ".");
	while(true){
		//System.out.println("You have $" + $ + ".");
		System.out.println("How much do you want to wager?");
		while(true){
			wager = sc.nextInt();
			sc.nextLine();
			if(wager > $){
			System.out.println("You do not have enough money for that.");}
			if(wager < 0){
			System.out.println("You can't do that.");}
			if((wager <= $) && (wager > 0)){
				break;}}
			slot1 = rand.nextInt(10);
			slot2 = rand.nextInt(10);
			slot3 = rand.nextInt(10);
			System.out.println(slot1 + " | " + slot2 + " | " + slot3);
			
			if((slot1 == slot2) && (slot1 == slot3)){
				System.out.println("JACKPOT");
				System.out.println("You won $" + (wager*2));
				$ = $+(wager*3);}
			else if((slot1 == slot2) || (slot2 == slot3) || (slot1==slot3)){
				System.out.println("Nice. You won $" + (wager) + ".");
				$ = $+(2*wager);}
			else if((slot1 != slot2) && (slot2 != slot3) && (slot1 != slot3)){
				System.out.println("Better luck next time.");}
				$ = $-wager;
				if($ <= 0){
					System.out.println("Looks like you've gone broke.");
					break;
				}
			System.out.println("You have $" + $ + ".");
			System.out.println("Would you like to play again?");
			yn = sc.nextLine();
			if((yn.equals("No")) || (yn.equals("no")) || (yn.equals("N")) || (yn.equals("n"))){
				break;}
			if((yn.equals("Yes")) || (yn.equals("yes")) || (yn.equals("Y")) || (yn.equals("y"))){
				System.out.println("OK");
			} 
			
	}
		System.out.print("See you next time.");
	}

	}

