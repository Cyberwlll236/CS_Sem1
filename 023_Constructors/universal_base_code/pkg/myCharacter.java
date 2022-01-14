package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;

	public myCharacter() {
		role  = new String("No Role");
	}
	
	public myCharacter(String a) {

		role = a;
		if(role.equals("rogue")){
			System.out.println("A rogue? How cunning!");}
		if(role.equals("wizard")){
			System.out.println("A wizard. How mystical!");}
		if(role.equals("warrior")){
			System.out.println("A warrior? How fierce!");}
		else{
			System.out.println("Pick one of the roles listed");
			role  = new String("No Role");
		}
	}
	

}