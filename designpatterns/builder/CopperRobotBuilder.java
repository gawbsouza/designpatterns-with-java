package designpatterns.builder;

public class CopperRobotBuilder extends RobotBuilder {

	@Override
	public void buildHead() {
		head = Material.COPPER;
	}

	@Override
	public void buildChest() {
		chest = Material.COPPER;
	}

	@Override
	public void buildArms() {
		leftArm = Material.COPPER;
		rightArm = Material.COPPER;
	}

	@Override
	public void buildHands() {
		leftHand = Material.COPPER;
		rightHand = Material.COPPER;
	}

	@Override
	public void buildLegs() {
		leftLeg = Material.COPPER;
		rightLeg = Material.COPPER;
	}

	@Override
	public void buildFeet() {
		leftFoot = Material.COPPER;
		rightFoot = Material.COPPER;
	}

	@Override
	public void addSpeaker() {
		speaker = () -> "Bahh duuu tii";
	}

}
