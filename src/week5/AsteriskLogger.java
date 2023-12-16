package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
	
	System.out.println("***" + log + "***");	
	}

	
	
	
	
	
	@Override
	public void error(String error) {
		
		
		
		System.out.println( asteriskLine(error.length()) + "\n**Error: "  + error + "**\n" + asteriskLine(error.length())   );
		
		
		
	}
	
	public static String asteriskLine (int length ) {
		String ast = "";
		for (int i = 0; i < (length +11); i++) {
			ast += "*";
		}
		return ast;
	}

}
