package vehicle;

public class Car extends Vehicle{
	
	private int horsePower;
	private String maxSpeed;
	private String color;
	
	
	public Car(int size, int horsePower, String maxSpeed, String color) {
		super(size, true, true);
		this.horsePower = horsePower;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}


	public String getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void handSteering() {
		super.handSteering();
		System.out.println("Car handSteering method called");
	}


	@Override
	public void changingGears() {
		super.changingGears();
		System.out.println("Car changingGears method called");
	}


	@Override
	public void moving() {
		super.moving();
		System.out.println("Car moving method called");

	}
	
	 
	
	

}
