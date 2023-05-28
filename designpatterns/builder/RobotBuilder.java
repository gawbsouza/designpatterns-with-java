package designpatterns.builder;

public abstract class RobotBuilder {

	protected Material head;
	protected Material chest;
	protected Material leftArm;
	protected Material rightArm;
	protected Material leftHand;
	protected Material rightHand;
	protected Material leftLeg;
	protected Material rightLeg;
	protected Material leftFoot;
	protected Material rightFoot;
	protected Speaker speaker;

	final public Robot build(String name) {
		validateHeadConstruction();
		validateChestConstruction();
		validateArmsConstruction();
		validateHandsConstruction();
		validateLegsConstruction();
		validateFeetConstruction();
		validateSpeakerAddition();
		return new Robot(name, head, chest, leftArm, rightArm, leftHand,
		rightHand, leftLeg, rightLeg, leftFoot, rightFoot, speaker);
	}

	abstract public void buildHead();
	abstract public void buildChest();
	abstract public void buildArms();
	abstract public void buildHands();
	abstract public void buildLegs();
	abstract public void buildFeet();
	abstract public void addSpeaker();

	private void validateHeadConstruction() {
		if (head == null) {
			throw new IllegalStateException(
				validateExceptionMessage("head"));
		}
	}

	private void validateChestConstruction() {
		if (chest == null) {
			throw new IllegalStateException(
				validateExceptionMessage("chest"));
		}
	}

	private void validateArmsConstruction() {
		if (leftArm == null) {
			throw new IllegalStateException(
				validateExceptionMessage("left arm"));
		}
		if (rightArm == null) {
			throw new IllegalStateException(
				validateExceptionMessage("right arm"));
		}
	}

	private void validateSpeakerAddition() {
		if (speaker == null) {
			throw new IllegalStateException("speaker must be added");
		}
	}

	private void validateHandsConstruction() {
		if (leftHand == null) {
			throw new IllegalStateException(
				validateExceptionMessage("left hand"));
		}
		if (rightHand == null) {
			throw new IllegalStateException(
				validateExceptionMessage("right hand"));
		}
	}

	private void validateLegsConstruction() {
		if (leftLeg == null) {
			throw new IllegalStateException(
				validateExceptionMessage("left leg"));
		}
		if (rightLeg == null) {
			throw new IllegalStateException(
				validateExceptionMessage("right leg"));
		}
	}

	private void validateFeetConstruction() {
		if (leftFoot == null) {
			throw new IllegalStateException(
				validateExceptionMessage("left foot"));
		}
		if (rightFoot == null) {
			throw new IllegalStateException(
				validateExceptionMessage("right foot"));
		}
	}

	private String validateExceptionMessage(String part) {
		return String.format("%s material must by specified", part);
	}

}
