import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedentrobot {
static Robot k2so;
public static void main(String[] args) {
 k2so= new Robot();
for (int i = 0; i < 10; i++) {
	

 String shape=JOptionPane.showInputDialog(null,"what shape do you want ,circal,square,triangle");
if (shape.equals("circal")) {
cir();	
}else if (shape.equals("square")) {
square();	
}else if (shape.equals("triangle")) {
tri();
}else{ 
 JOptionPane.showMessageDialog(null, "invaled");
}
 
} 

	
}	

 public static void square() {
	for (int i = 0; i < 4; i++) {
		k2so.setSpeed(100);
		k2so.penDown();
		k2so.move(50);
			k2so.turn(90);	


}
}
 
public static void tri() {
 for (int i = 0; i < 3; i++) {
k2so.setSpeed(100);
	k2so.penDown();
	k2so.move(100);
	 k2so.turn(120);
}
}

public static void cir() {
for (int i = 0; i < 360; i++) {
	k2so.setSpeed(1000);
	k2so.penDown();
	k2so.move(1);
	 k2so.turn(1);
}
}	
	









}