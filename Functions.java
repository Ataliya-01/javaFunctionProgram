//Print a given name in a function
import java.util.*;
public class Functions{
	public static void printMyName(String name){
		System.out.println(name);
	return;
	}
	
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		//call the function
		printMyName(name);
	}
}
		
		
		