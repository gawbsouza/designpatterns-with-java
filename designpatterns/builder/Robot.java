package designpatterns.builder;

public class Robot implements Speaker{

	private Material head;
	private Material chest;
	private Material leftArm;
	private Material rightArm;
	private Material leftHand;
	private Material rightHand;
	private Material leftLeg;
	private Material rightLeg;
	private Material leftFoot;
	private Material rightFoot;
	private Speaker speaker;
	private String name;

	Robot(
		String name, Material head, Material chest, Material leftArm, 
		Material rightArm, Material leftHand, Material rightHand, 
		Material leftLeg, Material rightLeg, Material leftFoot, 
		Material rightFoot, Speaker speaker
	) {
		this.name = name;
		this.head = head;
		this.chest = chest;
		this.leftArm = leftArm;
		this.rightArm = rightArm;
		this.leftHand = leftHand;
		this.rightHand = rightHand;
		this.leftLeg = leftLeg;
		this.rightLeg = rightLeg;
		this.leftFoot = leftFoot;
		this.rightFoot = rightFoot;
		this.speaker = speaker;
	}

	public Material getHead() {
		return head;
	}

	public Material getChest() {
		return chest;
	}

	public Material getLeftArm() {
		return leftArm;
	}

	public Material getRightArm() {
		return rightArm;
	}

	public Material getLeftHand() {
		return leftHand;
	}

	public Material getRightHand() {
		return rightHand;
	}

	public Material getLeftLeg() {
		return leftLeg;
	}

	public Material getRightLeg() {
		return rightLeg;
	}

	public Material getLeftFoot() {
		return leftFoot;
	}

	public Material getRightFoot() {
		return rightFoot;
	}

	public String getName() {
		return name;
	}

	@Override
	public String speak() {
		return speaker.speak();
	}

	public void printInfos() {
		StringBuilder infos = new StringBuilder();
		infos.append(String.format("Name: %s\n", name));
		infos.append(String.format(" --| head: %s\n", head));
		infos.append(String.format(" --| left arm: %s, right arm: %s\n",
									leftArm, rightArm));
		infos.append(String.format(" --| left hand: %s, right hand: %s\n",
									leftHand, rightHand));
		infos.append(String.format(" --| chest: %s\n", chest));
		infos.append(String.format(" --| left leg: %s, right leg: %s\n",
									leftLeg, rightLeg));
		infos.append(String.format(" --| left foot: %s, right foot: %s\n",
									leftFoot, rightFoot));
		infos.append(String.format(" --| speaking: \"%s\"\n", speak()));
		System.out.println(infos.toString());
	}
}
