package javapractice.bobsburgers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hamburger {

	private double price;
	private String rollType;
	private String meat;
	private ArrayList<String> customerAdditions = new ArrayList<String>();
	private Map<String, Double> storeAdditions = new HashMap<String, Double>() {
		{
			put("lettuce", 0.25);
			put("tomatoes", 0.30);
			put("pickles", 0.20);
			put("mustard", 0.10);
			put("ketchup", 0.10);
			put("mayo", 0.15);
			put("onions", 0.20);
		}
	};

	public Hamburger(double price, String rollType, String meat) {
		this.price = price;
		this.rollType = rollType;
		this.meat = meat;
	}

	public ArrayList<String> getCustomerAdditions() {
		return customerAdditions;
	}

	public double getPrice() {
		return price;
	}

	public String getRollType() {
		return rollType;
	}

	public void setRollType(String rollType) {
		this.rollType = rollType;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public Map<String, Double> getStoreAdditions() {
		return storeAdditions;
	}

	public ArrayList<String> addAdditions(String addition) {
		for (Map.Entry<String, Double> storeItem : storeAdditions.entrySet()) {
			if (customerAdditions.size() == 0) {
				if (addition.equalsIgnoreCase(storeItem.getKey())) {
					System.out.println("Adding addition to your burger!");
					customerAdditions.add(addition);
				}
			} else {
				for (int i = 0; i < this.customerAdditions.size(); i++) {
					if (addition.equalsIgnoreCase(customerAdditions.get(i))
							&& addition.equalsIgnoreCase(storeItem.getKey())) {
						System.out.println("Addition has already been added");
					} else if (!addition.equalsIgnoreCase(customerAdditions.get(i))
							&& addition.equalsIgnoreCase(storeItem.getKey())) {
						System.out.println("Adding addition to your burger!");
						customerAdditions.add(addition);
					}
				}
			}
		}
		return this.customerAdditions;
	}

	public void addAdditionsPrice(ArrayList<String> customerAdditions) {
		for (int i = 0; i < customerAdditions.size(); i++) {
			for (Map.Entry<String, Double> item : storeAdditions.entrySet()) {
				if (customerAdditions.get(i).equalsIgnoreCase(item.getKey())) {
					this.price += item.getValue();
				}
			}
		}
	}
}
