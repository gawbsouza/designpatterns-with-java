package designpatterns.builder;

public class RandomRobotBuilder extends RobotBuilder {

	private Material[] materials;

	public RandomRobotBuilder() {
		materials = Material.values();
	}

	@Override
	public void buildHead() {
		head = getRandomMaterial();
	}

	@Override
	public void buildChest() {
		chest = getRandomMaterial();
	}

	@Override
	public void buildArms() {
		leftArm = getRandomMaterial();
		rightArm = getRandomMaterial();
	}

	@Override
	public void buildHands() {
		leftHand = getRandomMaterial();
		rightHand = getRandomMaterial();
	}

	@Override
	public void buildLegs() {
		leftLeg = getRandomMaterial();
		rightLeg = getRandomMaterial();
	}

	@Override
	public void buildFeet() {
		leftFoot = getRandomMaterial();
		rightFoot = getRandomMaterial();
	}

	@Override
	public void addSpeaker() {
		speaker = () -> "Ghuji Lipqw 42!";
	}
	
	private Material getRandomMaterial() {
		return materials[(int) (Math.random() * materials.length)];
	}
}
