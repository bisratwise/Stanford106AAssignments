package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public void run(){
		removeAllOccurrences("This is a test", 't')returns"This is a es"
		removeAllOccurrences("Summer is here!", 'e')returns"Summr is hr"
		removeAllOccurrences("---0---", '-')returns"0"
		
		}
	public String removeAllOccurrences(String str, char ch) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result += str.charAt(i);
			}
			System.out.println("String after Removing 't' = "+str.replace("t", ""));
			
		}
		return result;
	}
		
}
		
	
      



	 

	

