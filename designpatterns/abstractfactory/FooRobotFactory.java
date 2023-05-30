package designpatterns.abstractfactory;

public class FooRobotFactory implements RobotFactory {

	@Override
	public HealthRobot createHealthRobot() {
		return new HealthRobot("Foo",  "Foo Health 1.p", "Robot n1");
	}

	@Override
	public HouseRobot creaHouseRobot() {
		return new HouseRobot("Foo", "Foo House h42", "Robot ap.01");
	}
	
}
