package week5;

import java.util.Scanner;

//Code by Khalil McVay
public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		
		
		
		
		System.out.println("Press Enter to Continue");
		Scanner sc= new Scanner(System.in);
		String nextLine = sc.nextLine();
	
		asterisk.log("Don't Read This Message");
		System.out.println("  ");
		
		 sc= new Scanner(System.in);
		nextLine= sc.nextLine();
		
		
		asterisk.error("You Have Read The Message. Please Look Away");
		System.out.println(" ");
		
		 sc= new Scanner(System.in);
			nextLine= sc.nextLine();
			
			
		spaced.log("You Did Not Look Away");
		System.out.println(" ");
	
		sc= new Scanner(System.in);
			nextLine= sc.nextLine();
			
		spaced.error("LOOK BEHIND YOU");
		System.out.println(" ");
		
			
	}

}
