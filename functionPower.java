//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;
class functionPower{
	public static int power(int x, int n){
		
		int pow = 1;
		for(int i = 0; i<n; i++){
			pow = pow*x;
		}
		return pow;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int calculate = power(x,n);
		System.out.println(calculate);
	}
}