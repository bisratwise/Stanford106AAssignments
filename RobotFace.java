package week2;

import acm.graphics.*;

import java.awt.*;

import acm.program.GraphicsProgram;
   
   public class RobotFace extends GraphicsProgram {
	   
       public static final double FACE_WIDTH=100;
	   public static final double FACE_HEIGHT=200;
	   public static final double radiusEye=0.3;
	   
	  
	
	   public void run( ){
		   double width=100;
		   double height=200;
		   

		   GRect rect = new GRect(FACE_WIDTH/2, FACE_HEIGHT/2, FACE_WIDTH, FACE_HEIGHT);
		  
     		rect.setFilled(true);
			rect.setColor(Color.GRAY);
			add(rect);
		   
			GOval leftEye = new GOval(75, 150, 15, 15);
     	    add(leftEye);

			GOval rightEye = new GOval(125, 150, 15, 15);
            add(rightEye);
            
            
			
		  }
	  	 
	}
	   
	



