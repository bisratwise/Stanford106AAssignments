package week4;
import acm.program.ConsoleProgram;
import java.io.*;

public class WordCount extends ConsoleProgram {
//Instance Variables
		int linesCount = 0; 
        int charsCount = 0;
        int wordsCount = 0;
        BufferedReader reader;
        
        public void run() {    //  main methods
     
        	String fileName = "lear.txt  ";
        try{
            //Creating BufferedReader object
             
    new BufferedReader(new FileReader(fileName));
            linesCount = countLines(reader);
             wordsCount = countWords(reader);
             charsCount = countChars(reader);
   
         println("File:" + fileName);
         println("Lines =" + linesCount);            
         println("Words =" + wordsCount); 
         println("Char =" + charsCount);
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
