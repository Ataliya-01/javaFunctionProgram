//Make a functtion to add 2 numbers and return the sum.
import java.util.Scanner;
public class FunctionSum{
	public static int caluclateSum(int a, int b){
		int sum=a+b;
		return 1;
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum = caluclateSum(a,b);
		System.out.println(sum);
	}
}

}