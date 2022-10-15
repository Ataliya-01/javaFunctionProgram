//Make a functtion to add 2 numbers and return the sum.
import java.util.Scanner;
public class FunctionSum{
	public static int caluclateSum(int a, int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum = caluclateSum(a,b);
		System.out.println("sum of two numbers:"+sum);
	}


}