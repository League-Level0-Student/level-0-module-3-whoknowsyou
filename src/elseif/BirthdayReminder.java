
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "may 9th";
		String dadsBirthday = "June 13th";
		String myBirthday = "january 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String day =JOptionPane.showInputDialog("whose birth day to you want to input");
		// 3. Print out what the user typed 		
		// 4. if user asked for "mom"
if (day.equals("mom's birthday")) {
	JOptionPane.showMessageDialog(null, momsBirthday ); 		

}else{if (day.equals("dad's birthday")) {
	JOptionPane.showMessageDialog(null, dadsBirthday); 		

}else{if (day.equals("my birthday")) {
	JOptionPane.showMessageDialog(null, myBirthday); 		

}else
	JOptionPane.showMessageDialog(null, "i do not know this persons birthday"); 		

//print mom's birthday


// 5. if user asked for "dad"


// print dad's birthday
		// 6. if user asked for your name


// print myBirthday
	//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}}}
