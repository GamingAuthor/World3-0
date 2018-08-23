package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] mister = new Robot[5];
		for(int i = 0; i<mister.length;i++) {
			mister[i] = new Robot();
			mister[i].moveTo(50+(i*100), 500);
			mister[i].setSpeed(10);
		}
		boolean raceOver=false;
		while(!raceOver) {
		for(int i = 0; i<mister.length;i++) {
			Random r = new Random();
			mister[i].move(r.nextInt(50));
			if(mister[i].getY()<=0) {
				raceOver=true;
				JOptionPane.showMessageDialog(null, "Robot "+(mister[i].getX()/50)+" has won!");
				break;
			}
		}
		
		}
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
