package week2;
import acm.program.*;

public class Fibonacci extends ConsoleProgram{
	
	public void run() {
			int a=0;
			int b=1;
			int c;
			println(a);
			println(b);
		while(a+b<10000) {
			c=a+b;
			a=b;
			b=c;
		println(c+" ");

			}
		
		}
	
	}



			
