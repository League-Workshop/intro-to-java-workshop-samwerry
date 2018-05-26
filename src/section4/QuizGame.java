package section4;

import javax.swing.JOptionPane;

import com.sun.javafx.geom.AreaOp.AddOp;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int sam= 100; 
		// 2.  Ask the user a question 
		String yes = JOptionPane.showInputDialog("how is your day?");
		// 3.  Use an if statement to check if their answer is correct
		if(yes.equals("good")) {
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		sam++;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String no= JOptionPane.showInputDialog("is today monday");
		if(no.equals("no")) {
			sam++; 
		}
		// 6.  After all the questions have been asked, print the user's score  
		JOptionPane.showMessageDialog(null, sam);
	
	
	}
	}

