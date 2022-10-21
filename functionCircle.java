//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
class functionCircle{ 

	public static double circum(double r){
		
		double circum = Math.PI*2*r;
		return circum;
	}
		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int r = sc.nextInt();
		
		double circum = circum(r);
		System.out.println(circum);
	}
}
	
	