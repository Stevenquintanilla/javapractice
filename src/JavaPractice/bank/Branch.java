package javapractice.bank;

import java.util.ArrayList;

public class Branch {

	private String branchName;
	private ArrayList<Customer> customersInBranch = new ArrayList<Customer>();

	public Branch(String branchName, ArrayList<Customer> customersInBranch) {
		this.branchName = branchName;
		this.customersInBranch = customersInBranch;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public ArrayList<Customer> getCustomersInBranch() {
		return customersInBranch;
	}
	
	public void setCustomersInBranch(ArrayList<Customer> customersInBranch) {
		this.customersInBranch = customersInBranch;
	}
	
	public void addCustomer(Customer customer) {
		customersInBranch.add(customer);
	}

}
