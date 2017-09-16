import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot robot = new Robot(); 
	robot.setSpeed(10);
	robot.penDown();
	robot.setRandomPenColor();
	robot.move(-100);
	robot.turn(90);
	robot.move(70);
	robot.penUp();
	robot.move(30);
	robot.penDown();
	robot.setRandomPenColor();
	robot.turn(90);
	robot.move(-50);
	robot.penUp();
	robot.turn(270);
	robot.move(30);
	robot.turn(90);
	robot.move(-50);
	robot.penDown();
	robot.setRandomPenColor();
	robot.move(100);
	robot.penUp();
	robot.turn(270);
	robot.move(20);
	robot.penDown();
	robot.setRandomPenColor();
	robot.turn(-60);
	robot.move(110);
	robot.turn(130);
	robot.move(75);
	robot.turn(110);
	robot.move(60);
	robot.turn(180);
	robot.move(60);
	robot.turn(70);
	robot.move(35);
	robot.penUp();
	robot.move(90);
	
}
}
