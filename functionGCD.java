//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.Scanner;
class functionGCD{
	public static int calculateGCD(int n, int m){
		  
		while(m != 0)  
			{  
				if(n > m)  
				{  
				n = n - m;  
				}  
				else  
				{  
				m = m - n;  
				}  
			}  
				return n;
	}
	
			  
  
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int gcd = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		gcd = calculateGCD(n,m);
		System.out.println(gcd);
	}
}
