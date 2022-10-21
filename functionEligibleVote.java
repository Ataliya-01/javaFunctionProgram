//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
class functionEligibleVote{
	public static int agePersonVote(int age){
		
		if(age>18)
		{
			System.out.println("eligible to vote");
		}else{
			System.out.println("not eligible to vote");
			
		}
		return 1;
	}
		
	public static void main(String[] args){
		System.out.println("Enter age:");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		agePersonVote(age);
	}
}
	
