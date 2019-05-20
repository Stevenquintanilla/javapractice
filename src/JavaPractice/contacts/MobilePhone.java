package javapractice.contacts;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contact> listOfContacts = new ArrayList<Contact>();

	public void addContact(Contact contact) {

		listOfContacts.add(contact);

	}

	public ArrayList<Contact> getListOfContacts() {
		return listOfContacts;
	}

	public void printAllContacts() {
		int i = 0;
		int longestNameLength = longestNameInList(getListOfContacts());
		if (this.listOfContacts.isEmpty()) {
			System.out.println("There are no contacts currently on your list");
		} else {
			System.out.println("List of all contacts: ");
			for (Contact contact : listOfContacts) {
				i++;
				if(contact.getName().length() == longestNameLength) {
					System.out.println(
							i + ". " + "Name: " + contact.getName() + " | Phone number: " + contact.getPhoneNumber());
				} else if (contact.getName().length() < longestNameLength){
					String noOfSpaces = "";
					for(int j = contact.getName().length(); j < longestNameLength; j++) {
						noOfSpaces += " ";
					}
					System.out.println(
							i + ". " + "Name: " + contact.getName() + noOfSpaces + " | Phone number: " + contact.getPhoneNumber());
				}
					
				}
		}
	}

	public void modifyContactName(String name, String newName) {
		int searchResult = findContact(name);
		if (searchResult == -1) {
			System.out.println("Contact not found");
		} else {
			Contact contact = listOfContacts.get(searchResult);
			contact.setName(newName);
			listOfContacts.set(searchResult, contact);
		}
	}

	public void modifyContactNumber(String name, String newNumber) {
		int searchResult = findContact(name);
		if (searchResult == -1) {
			System.out.println("Contact not found");
		} else {
			Contact contact = listOfContacts.get(searchResult);
			contact.setPhoneNumber(newNumber);
			;
			listOfContacts.set(searchResult, contact);
		}
	}

	public void removeContact(String name) {
		int searchResult = findContact(name);
		if (searchResult == -1) {
			System.out.println("Contact not found");
		} else {
			listOfContacts.remove(searchResult);
		}
	}

	public void getContactInfo(String name) {
		Contact contact;
		int searchResult = findContact(name);
		if (searchResult == -1) {
			System.out.println("Contact not found");
		} else {
			contact = listOfContacts.get(searchResult);
			System.out.println("Name: " + contact.getName() + " Phone number: " + contact.getPhoneNumber());
		}
	}

	public int findContact(String name) {
		Contact contact;

		for (Contact contactInList : listOfContacts) {
			if (contactInList.getName().equalsIgnoreCase(name)) {
				contact = contactInList;
				return listOfContacts.indexOf(contact);
			}
		}

		return -1;

	}
	
	public int longestNameInList(ArrayList<Contact> list) {
		int longestNameLength = 0;
		
		for(Contact contactInList :list) {
			if(contactInList.getName().length() > longestNameLength) {
				longestNameLength = contactInList.getName().length();
			}
		}
		return longestNameLength;
	}

}
