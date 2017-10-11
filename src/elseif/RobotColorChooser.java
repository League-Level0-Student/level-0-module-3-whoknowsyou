
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot k2so = new Robot();
k2so.setSpeed(50);
k2so.penDown();
//3. ask the user what color they would like the robot to draw
String color =JOptionPane.showInputDialog("what color do you want");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
k2so.setPenColor(Color.RED);	
}else if (color.equals("blue")) {
k2so.setPenColor(Color.BLUE);	
}else if (color.equals("orange")) {
k2so.setPenColor(Color.ORANGE);	
}else{
        //5. if the user doesn’t enter anything, choose a random color
	k2so.setRandomPenColor();
}        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
	
		//2. set the pen width to 10
		k2so.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
for(int i=0; (i<100);i++){
k2so.move(i+100);
k2so.turn(10+i);
	}
}
}