package javapractice.bobsburgers;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean menuLoop= true;
		Scanner scanner = new Scanner(System.in);
		boolean correctBurgerCheck = false;
		System.out.println("Welcome to Bob's Burger! What kind of burger would you like (Beef or Vegan)");
		Hamburger burger = new Hamburger(0.00, "Nobread", "nothing");

		
		do {
			String customerBurger = scanner.nextLine();
			if(customerBurger.equalsIgnoreCase("beef")) {
				burger = new Hamburger(1.00, "White", "Beef");
				correctBurgerCheck = true;
			} else if(customerBurger.equalsIgnoreCase("vegan")) {
				burger = new VeganBurger(2.00, "Wheat", "Vegan");
				correctBurgerCheck = true;
			} else {
				System.out.println("Please type correctly");
			}
		} while(correctBurgerCheck == false);

		
		do {
			System.out.println("What would you like on your " + burger.getMeat() +  " burger?");
			String customerAddtion = scanner.nextLine();
			burger.addAdditions(customerAddtion);

			System.out.println("Would you like to add more? y/n");
			String continueConfirm = scanner.nextLine();
			
			if(continueConfirm.equalsIgnoreCase("y")) {
				continue;
			} else {
				menuLoop = false;
			}
			
		}while(menuLoop == true);
		burger.addAdditionsPrice(burger.getCustomerAdditions());
		for(int i = 0; i < burger.getCustomerAdditions().size(); i++) {
			System.out.println("Your additions: " + burger.getCustomerAdditions().get(i));
		}
		System.out.println("You owe :" + burger.getPrice());
		
		scanner.close();

	}
}
