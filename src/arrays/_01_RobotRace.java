package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	boolean isracing = true;
	//2. create an array of 5 robots.
	
	Robot[] robarray = new Robot[5];
	
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < 5; i++) {
		robarray[i] = new Robot();
		robarray[i].setSpeed(10);
		robarray[i].setAngle(90);
		robarray[i].move((110* i)-220);
		robarray[i].setAngle(180);
		robarray[i].move(200);
		robarray[i].setAngle(0);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	Random randgen = new Random();
	
	while (isracing == true) {
	for(int i = 0; i < 5; i++) {
		
		robarray[i].move(randgen.nextInt(50));
		
		if (robarray[i].getY() <= 0) {
			isracing = false;
			JOptionPane.showMessageDialog(null, "Congrats to Robot #" + (i + 1) + " they have won the race!");
			System.exit(0);
			
		}
	}
	}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
