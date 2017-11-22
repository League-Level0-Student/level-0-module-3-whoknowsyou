//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		// 11. do the following 10 times
for(int j=0;j<=10;j++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String cats=JOptionPane.showInputDialog(null, "guess a nummber between 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int cat =Integer.parseInt(cats);		
			// 5. if the guess is correct
		if (cat==random) {
		// 6. win
		System.out.println("you win");
		}else
			// 7. if the guess is high
		if (cat>random) {
		System.out.println("to high");	
		}else
				// 8. tell them it's too high
			// 9. if the guess is low
		if (cat<random) {
System.out.println("to low");			
		}else{
				// 10. tell them it's too low
System.out.println("you lose");
	// 12. tell them they lose
	}
		}
	
}
}

