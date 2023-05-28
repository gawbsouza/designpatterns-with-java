package designpatterns.builder;

import java.util.Objects;

public class RobotCreator {
	
	public static Robot create(RobotBuilder builder, String name) {
		Objects.requireNonNull(builder);
		Objects.requireNonNull(name);
		builder.buildHead();
		builder.buildChest();
		builder.buildArms();
		builder.buildHands();
		builder.buildLegs();
		builder.buildFeet();
		builder.addSpeaker();
		return builder.build(name);
	}
}
