package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import sun.java2d.pipe.LoopBasedPipe;

public class FourSquare {

	// 2. Create a new Robot
	static Robot jack = new Robot();

	public static void main(String[] args) {
		go();
	}

	static void go() {
		// 4. Make the robot move as fast as possible
		jack.setSpeed(100000);
		jack.penDown();
		// 5. Set the pen width to 5
		jack.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++)
			;
		// 7. Set the pen color to random
		jack.setRandomPenColor();
		// 1. Call the drawSquare() method
		drawSquare();

		// 8. Turn the robot 90 degrees to the right
		jack.turn(90);
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	static void drawSquare() {
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		jack.move(90);
		jack.turn(90);
		jack.move(90);

		JOptionPane.showMessageDialog(null, "yay! you  called the drawSquare() method!");
	}

}
