//Find the factorial numbers
import java.util.*;
public class FunctionFact{
	public static void calculateFactorial(int n){
		
		int factorial=1;
		//loop
		for(int i=n;i>=1;i--){
			factorial = factorial*i;
		}
		
		System.out.println(factorial);
		return;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		calculateFactorial(n);
	}
}