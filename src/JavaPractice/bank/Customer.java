package javapractice.bank;

import java.util.ArrayList;

import javax.transaction.Transaction;

public class Customer {

	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void addTransaction(double transactionAmount) {
		String formatCheck = transactionAmount + "";
//		boolean correctFormat = false;
		int indexOfDecimal = formatCheck.indexOf(".");
		String dollars = formatCheck.substring(0, indexOfDecimal + 1);
		String cents = formatCheck.substring(indexOfDecimal, indexOfDecimal + 3);
		if (formatCheck.indexOf(".") == formatCheck.length() - 3 && dollars.matches("[0-9]+")
				&& cents.matches("[0-9]+")) {
			transactions.add(transactionAmount);
//			correctFormat = true;
		} else {
			System.out.println("Please enter the transaction correctly and try again");
		}

	}

	public void showAllTransactions() {
		for (double transaction : transactions) {
			System.out.println("$" + transaction);
		}
	}

}
