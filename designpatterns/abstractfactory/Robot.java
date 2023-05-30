package designpatterns.abstractfactory;

public class Robot {
	
	private String brand;
	private String model;
	private String system;
	
	public Robot(String brand, String model, String system) {
		this.brand = brand;
		this.model = model;
		this.system = system;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getSystem() {
		return system;
	}

	@Override
	public String toString() {
		return String.format("Brand: %s, Model: %s, System: %s",
								brand, model, system);
	}
}
