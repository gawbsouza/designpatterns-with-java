import designpatterns.abstractfactory.BarRobotFactory;
import designpatterns.abstractfactory.FooRobotFactory;
import designpatterns.abstractfactory.HealthRobot;
import designpatterns.abstractfactory.HouseRobot;
import designpatterns.abstractfactory.RobotFactory;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		RobotFactory factory = new FooRobotFactory();

		HealthRobot healthRobot = factory.createHealthRobot();
		HouseRobot houseRobot = factory.creaHouseRobot();

		System.out.println("Health Robot: " + healthRobot);
		System.out.println("House Robot: " + houseRobot);

		factory = new BarRobotFactory();

		healthRobot = factory.createHealthRobot();
		houseRobot = factory.creaHouseRobot();

		System.out.println("Health Robot: " + healthRobot);
		System.out.println("House Robot: " + houseRobot);
	}
}
