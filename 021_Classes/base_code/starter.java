import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Rogue");
	int Str = 3;
	int Dex = 8;
	int Int = 5;
	int Con = 4;
	int Cha = 3;
}
class starter {
	public static void main(String args[]) {

	Character Edgelord =  new Character();
	System.out.println(Edgelord.Str);
	System.out.println(Edgelord.Dex);
	System.out.println(Edgelord.Int);
	System.out.println(Edgelord.Con);
	System.out.println(Edgelord.Cha);
	
	}
}
