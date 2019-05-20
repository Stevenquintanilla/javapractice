package javapractice.polymorphism;

class Car {
	private String color;
	private int noOfCylinders;
	private String engine;

	public Car(String color, int noOfCylinders, String engine) {
		this.color = color;
		this.noOfCylinders = noOfCylinders;
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public String getEngine() {
		return engine;
	}

	public void startEngine() {
		System.out.println("Starting my :" + getEngine() + " engine");
	}

	public void accelerate() {
		System.out.println("Gotta go fast with my " + getNoOfCylinders());
	}
}

class Ferrari extends Car {

	private String make;
	private int modelYear;
	private String name;

	public Ferrari(String color, int noOfCylinders, String engine, String make, int modelYear) {
		super(color, noOfCylinders, engine);
		this.make = make;
		this.modelYear = modelYear;
		this.name = "Ferrari";
	}

	public String getMake() {
		return make;
	}

	public int getModelYear() {
		return modelYear;
	}

	public String getName() {
		return name;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting my :" + getName() + "'s " + getEngine() + " engine");
	}

	@Override
	public void accelerate() {
		System.out.println("Gotta go fast with my " + getName() + "'s " + getNoOfCylinders() + " cylinders engine");
	}

}

class Lamborghini extends Car {

	private String make;
	private int modelYear;
	private String name;

	public Lamborghini(String color, int noOfCylinders, String engine, String make, int modelYear) {
		super(color, noOfCylinders, engine);
		this.make = make;
		this.modelYear = modelYear;
		this.name = "Lamborghini";
	}

	public String getMake() {
		return make;
	}

	public int getModelYear() {
		return modelYear;
	}

	public String getName() {
		return name;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting my :" + getName() + "'s " + getEngine() + " engine");
	}

	@Override
	public void accelerate() {
		System.out.println("Gotta go fast with my " + getName() + "'s " + getNoOfCylinders() + " cylinders engine");
	}

}

public class Main {

	public static void main(String[] args) {

		Car ferrariCar = new Ferrari("red", 8, "V8", "Ferrari 599 GTB Fiorano", 2009);
		ferrariCar.accelerate();
		ferrariCar.startEngine();
		Car lamborghiniCar = new Lamborghini("Blue", 10, "V6", "Lamborghini 275 GTX", 2014);
		lamborghiniCar.accelerate();
		lamborghiniCar.startEngine();
	}
}
