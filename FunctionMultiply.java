//Make a function to multiply 2 numbers and return the product
import java.util.Scanner;
public class FunctionMultiply{
	public static int calculateMultiply(int a, int b){
		int mul=a*b;
		return mul;
	}
	
		public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int mul=calculateMultiply(a,b);
		System.out.println("multiply two numbers:"+mul);
	}
}