package section3;

import javax.swing.JOptionPane;
import javax.xml.ws.Response;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
 String james =  JOptionPane.showInputDialog(" do you know how to wright code?");
		// 2. If they say "yes", tell them they will rule the world.
if(james.equals("yes")) { JOptionPane.showMessageDialog(null, "you will rule the world");

	
}

	

	

		// 3. Otherwise, wish them good luck washing dishes.
if(james.equals("no")) {JOptionPane.showMessageDialog(null, "good luck washing dishes");
}
	}
}


