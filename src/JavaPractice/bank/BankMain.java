package javapractice.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {

	private static Bank bank = new Bank();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;

		while (!quit) {
			bankMenu();
			String answer = scanner.nextLine();

			switch (Integer.parseInt(answer)) {

			case 1:
				addBranch();
				break;
			case 2:
				addCustomer();
				break;
			case 3:
				addTransaction();
				break;
			case 4:
				bank.showAllCustomers();
				break;
			case 5:
				bank.showAllBranches();
				break;
			case 6:
				quit = true;
				System.out.println("Bye! Have a wonderful time!");
			default:
				System.out.println("Please pick an option in the menu");
			}

		}
	}

	public static void bankMenu() {
		System.out.println("Welcome to the bank application! How may I help you?");
		System.out.println("1. Add branch");
		System.out.println("2. Add Customer");
		System.out.println("3. Add a transaction");
		System.out.println("4. Show all customers");
		System.out.println("5. Show all branches");
		System.out.println("6. Quit");
	}

	public static void addBranch() {

		boolean noDuplicateFound = true;
		System.out.println("Enter a new branch name");
		String branchName = scanner.nextLine();

		for (Branch branch : bank.getBranchesInBank()) {
			if (branch.getBranchName().equalsIgnoreCase(branchName)) {
				System.out.println("Duplicate found, sorry cannot use this name: Please try again");
				noDuplicateFound = false;
			} 
		}

		if (noDuplicateFound == true) {
			System.out.println("Enter a customer's name to initiate this branch");
			String name = scanner.nextLine();
			Customer customer = new Customer(name);
			System.out.println("Enter a initial transaction");
			String transactionAmount = scanner.nextLine();
			customer.addTransaction(Double.parseDouble(transactionAmount));
			ArrayList<Customer> customersInBranch = new ArrayList<Customer>();
			customersInBranch.add(customer);
			Branch branch = new Branch(branchName, customersInBranch);
			bank.addBranch(branch);
			System.out.println("Branch has been successfully been created");
		}

	}

	public static void addCustomer() {
		System.out.println("What branch would you like to add a customer to?");
		String branchName = scanner.nextLine();
		for (Branch branch : bank.getBranchesInBank()) {
			if (!branchName.equalsIgnoreCase(branch.getBranchName())) {
				System.out.println("Sorry couldn't find that branch name please try again from the menu");
				break;
			} else {
				System.out.println("Enter a customer name");
				String name = scanner.nextLine();
				for (Customer customer : branch.getCustomersInBranch()) {
					if (customer.getName().equalsIgnoreCase(name)) {
						System.out.println("Sorry a person of that name has already been found please"
								+ " try again from the menu");
					} else {
						Customer newCustomer = new Customer(name);
						System.out.println("Enter a inital transaction to create this customer");
						String transactionAmount = scanner.nextLine();
						newCustomer.addTransaction(Double.parseDouble(transactionAmount));
						branch.addCustomer(newCustomer);
						System.out.println("Customer has been successfully been added");
					}
				}

			}
		}
	}

	public static void addTransaction() {
		System.out.println("Enter the name of the of the branch you would like to find the customer in");
		String branchName = scanner.nextLine();
		for (Branch branch : bank.getBranchesInBank()) {
			if (!branchName.equalsIgnoreCase(branch.getBranchName())) {
				System.out.println("Sorry couldn't find that branch name please try again from the menu");
				break;
			} else {
				System.out.println("Enter a customer name");
				String name = scanner.nextLine();
				for (Customer customer : branch.getCustomersInBranch()) {
					if (customer.getName().equalsIgnoreCase(name)) {
						System.out.println("Enter the transaction amount");
						String transactionAmount = scanner.nextLine();
						customer.addTransaction(Double.parseDouble(transactionAmount));
						System.out.println("Transaction has been successfully been added");
						break;
					}
				}
			}
		}
	}

	public static void showAllCustomers() {
		bank.showAllCustomers();
	}

}
