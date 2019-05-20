package vehicle;

public class Lancer extends Car {

	private int modelYear;
	private String dealership;
	private String make;
	
	public Lancer(int size, int horsepower, String maxSpeed, String color, 
		int modelYear, String dealership, String make) {
		super(size, horsepower, maxSpeed, color);
		this.modelYear = modelYear;
		this.dealership = dealership;
		this.make = make;
	}

	@Override
	public void handSteering() {
		super.handSteering();
		System.out.println("Lancer handSteering method called");
	}

	@Override
	public void changingGears() {
		super.changingGears();
		System.out.println("Lancer changingGears method called");

	}

	@Override
	public void moving() {
		super.moving();
		System.out.println("Lancer moving method called");
	}
	
	public static void main(String[] args) {
		Lancer lancer = new Lancer(1, 223, "140 mph", "Grey", 2008, 
				"Jim's dealership", "Mitsubishi");
		
		lancer.moving();
		lancer.changingGears();
		lancer.handSteering();
		
	}
	
	
}
