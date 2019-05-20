package javapractice.bobsburgers;

import java.util.HashMap;
import java.util.Map;

public class VeganBurger extends Hamburger{
	
	private Map<String, Double> storeAdditions = new HashMap<String, Double>() {
		{
			put("lettuce", 0.25);
			put("tomatoes", 0.30);
			put("pickles", 0.20);
			put("mustard", 0.10);
			put("ketchup", 0.10);
			put("mayo", 0.15);
			put("onions", 0.20);
			put("specialsauce", 1.00);
			put("jalapenos", 0.40);
		}
	};
	
	public VeganBurger(double price, String rollType, String meat) {
		super(price, rollType, meat);
	}

}
