package designpatterns.abstractfactory;

public class BarRobotFactory implements RobotFactory {

	@Override
	public HealthRobot createHealthRobot() {
		return new HealthRobot("Bar",  "Bar HE.4", "Barnix 1.4");
	}

	@Override
	public HouseRobot creaHouseRobot() {
		return new HouseRobot("Bar", "Bar H m2", "Barnix m2");
	}
	
}
