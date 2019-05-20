package vehicle;

public class Vehicle {
	
	private int size;
	private boolean isOn;
	private boolean hasFuel;
	
	
	
	public Vehicle(int size, boolean isOn, boolean hasFuel) {
		this.size = size;
		this.isOn = isOn;
		this.hasFuel = hasFuel;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public boolean isOn() {
		return isOn;
	}



	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}



	public boolean isHasFuel() {
		return hasFuel;
	}



	public void setHasFuel(boolean hasFuel) {
		this.hasFuel = hasFuel;
	}
	
	public void handSteering() {
		System.out.println("Vehicle handSteering method called");
	}
	
	public void changingGears() {
		System.out.println("Vehicle changeGears method called");
	}
	
	public void moving() {
		System.out.println("Vehicle moving method called");
	}

	

}
