package javapractice.bank;

import java.util.ArrayList;

public class Bank {

	private String bankName;
	private ArrayList<Branch> branchesInBank = new ArrayList<Branch>();

	public Bank() {
		this.bankName = "America's Bank";
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Branch> getBranchesInBank() {
		return branchesInBank;
	}

	public void addBranch(Branch branch) {
		branchesInBank.add(branch);
	}
	
	public void addTransactionToCustomer(String customerName, double transactionAmount) {
		for(Branch branch: branchesInBank) {
			for(Customer customer : branch.getCustomersInBranch()) {
				if(customer.getName() == customerName) {
					customer.addTransaction(transactionAmount);
					System.out.println("Transaction successfuly added");
				} else {
					System.out.println("Could not find the customer's name in our bank");
				}
			}
		}
	}
	
	public void showAllCustomers() {
		int i = 0;
		for(Branch branch : branchesInBank) {
			for(Customer customer : branch.getCustomersInBranch()) {
				i++;
				System.out.print(i + ". " + customer.getName() + "Transactions: ");
				for(Double transaction: customer.getTransactions()) {
					System.out.println("$" + transaction);
				}
			}
		}
	}
	
	public void showAllBranches() {
		int i = 0;
		for(Branch branch : branchesInBank) {
			System.out.println(i + ". " + branch.getBranchName());
		}
	}

}
