import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
	int x = a;
	int y = b;
	int c = 1;
	int ans = 1;
	while(true){
		ans=ans*x;
		if(c == y){
			break;
		}
		c=c+1;
	}
	return ans;
	}
	
	public static void main(String args[]) {
		
	int x = 5;
	int y = 3;
	System.out.print(pow(x,y));



		
	}
}
