import designpatterns.builder.Robot;
import designpatterns.builder.RobotBuilder;
import designpatterns.builder.RobotCreator;
import designpatterns.builder.CopperRobotBuilder;
import designpatterns.builder.RandomRobotBuilder;

public class BuilderPattern {
	public static void main(String[] args) {

		RobotBuilder copperBuilder = new CopperRobotBuilder();
		RobotBuilder randomBuilder = new RandomRobotBuilder();
		
		Robot copperRobot = RobotCreator.create(
									copperBuilder,"My Copper Robot");
		Robot randomRobot = RobotCreator.create(
									randomBuilder, "My Random Robot");

		copperRobot.printInfos();

		System.out.println("-------------\n");
		
		randomRobot.printInfos();
	}
}
