package week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
	
		asterisk.log("Don't Read This Message");
		System.out.println(" ");
		asterisk.error("You Have Read The Message. Please Look Away");
		System.out.println(" ");
		spaced.log("You Did Not Look Away");
		System.out.println(" ");
		spaced.error("LOOK BEHIND YOU");
		System.out.println(" ");
		
			
	}

}
