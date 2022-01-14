import java.util.Random;
import java.util.Scanner;

class starter {
	
	public static int md(int a, int b){
	int x = a;
	int y = b;
	int xy = x*y;
	//return xy;
	if(xy%3 == 0){
		return xy;}
	else{return 0;}
	}
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give me two numbers.");
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println(md(x,y));
	}
}
