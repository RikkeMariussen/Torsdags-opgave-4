import java.util.Scanner;

public class Task2{
	
	public static void main (String [] args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type your name");

		String input = scan.nextLine();
		
		System.out.println(input + ", will you please type your age:");
		
		Scanner scan2 = new Scanner(System.in);
		
		String input2 = scan2.nextLine();
			
		int age = Integer.parseInt(input2);
		
		System.out.println("Are you really " + age + " years old?");
		System.out.println("You look so young!");
	
		int yearsToRetirement = 67-age;
		
		System.out.println("You only have " + yearsToRetirement + " years left until you can retire. Congrats.");
		
		
	}
}