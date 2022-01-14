import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int rand_num1 = rand.nextInt(10);
	int rand_num2 = rand.nextInt(100);
	double rand_num3 = rand.nextDouble();
	int rand_num4 = rand.nextInt(574);
	double rand_num5 = rand.nextDouble();
	
	System.out.println(rand_num1);
	System.out.println(rand_num2+1);
	System.out.println(rand_num3+2.5);
	System.out.println(rand_num4+rand_num5+14);
	
	
	 
	}
}
