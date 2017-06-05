import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		
		Robot K= new Robot();
	K.setSpeed(10);
	K.miniaturize();
	K.moveTo(10,600);
	K.penDown();
K.move(50);
K.turn(20);
K.move(30);
K.turn(140);
K.move(30);
K.turn(20);
K.move(50);
		
K.turn(270);		
K.move(20);
K.turn(270);
K.move(100);
K.turn(90);
K.move(20);
K.turn(90);
K.move(100);
		
K.turn(270);		
K.move(20);
K.turn(270);
		
K.move(20);
K.turn(30);
K.move(20);
K.turn(30);
K.move(10);
K.turn(180);
K.move(10);
K.turn(260);
		
	}
}
