package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				turnLeft();
				move();
				//pick up beeper if present
				while (beepersPresent())
					pickBeeper();
				turnAround();
				move();
				move();
				//pick up beeper if present
				while (beepersPresent())
					pickBeeper();
				turnAround();
				move();
				turnRight();
			}
			move();
		}
			
		
		
//	move();
//		{
//			if (beepersPresent()) {
//				move();
//			} else {
//				pickBeeper();
//				move();
//			}
//		}
//
	}

}

