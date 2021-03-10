package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public void run(){
		removeAllOccurrences("This is a test", 't');
		removeAllOccurrences("Summer is here!", 'e');
		removeAllOccurrences("---0---", '-');	
		}
	public String removeAllOccurrences(String str, char ch) {
		String result = "This is a test";		
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result += str.charAt(i);
			}
			println("String after Removing 't' = "+str.replace("t", "This is a es"));
			println("String after Removing 'e' = "+str.replace("e", "Summer is hr"));
			println("String after Removing '-' = "+str.replace("-", "0"));
		
		}
		return result;
		
	}
}
		
	
      



	 

	

