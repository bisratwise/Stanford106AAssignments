package week1;
import stanford.karel.*;

public class BeeperpickingKarel extends SuperKarel {

	public void run() {
		move();{
			if(beepersPresent()) {
				move();
			}else {
				pickBeeper();
				move();
			}
		}
		
				
	}
	
		
}
	
