package javapractice.contacts;

import java.util.Scanner;

public class MobileMain {
	
	private static MobilePhone mobilePhone = new MobilePhone();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean quit = false;
		while (!quit) {
			System.out.println();
			phoneMenu();
			int answer = scanner.nextInt();
			scanner.nextLine();
			
			switch (answer) {
			case 1:
				showAll();
				break;
			case 2:
				addContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				modifyContactNumber();
				break;
			case 5:
				modifyContactName();
				break;
			case 6:
				searchContact();
				break;
			case 7:
				quit = true;
				System.out.println("Bye! Have a wonderful time!");
				break;
			}
		}
		
	}
	
	public static void phoneMenu() {
		System.out.println("Welcome to your phone! What would you like to do?");
		System.out.println("1. Show All Contacts");
		System.out.println("2. Add Contacts");
		System.out.println("3. Remove Contact");
		System.out.println("4. Modify a Contact's Number");
		System.out.println("5. Modify a Contact's Name");
		System.out.println("6. Search for a Contact's information");
		System.out.println("7. Quit");

	}
	
	public static void showAll() {
		mobilePhone.printAllContacts();
	}
	
	public static void removeContact() {
		System.out.println("Please enter the name of the contact you would like to remove :");
		String name = scanner.nextLine();
		mobilePhone.removeContact(name);
		System.out.println("Contact has been successfully removed");
	}
	
	public static void modifyContactName() {
		System.out.println("Please enter the name of the contact you would like to modify: ");
		String name = scanner.nextLine();
		int searchResult = mobilePhone.findContact(name);
		if (searchResult == -1) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Enter the new name of the contact");
			String newName = scanner.nextLine();
			mobilePhone.modifyContactName(name, newName);
			System.out.println("Contact has been successfully modified");
		}
	}
	
	public static void modifyContactNumber() {
		boolean correctFormat = false;
		System.out.println("Please enter the name of the contact you would like to modify: ");
		String name = scanner.nextLine();
		while(correctFormat == false) {
			System.out.println("Please enter the contact's number");
			String number = scanner.nextLine();
			if(formatNum(number) != "incorrect format") {
				correctFormat = true;
				number = formatNum(number);
				mobilePhone.modifyContactNumber(name, number);
				System.out.println("Contact has been successfully added");
			} else {
				System.out.println("Please enter a number in the correct format you bum");
			}
		}
		
	}
	
	public static void addContact() {
		boolean correctFormat = false;
		System.out.println("Enter contact's name");
		String name = scanner.nextLine();
		while(correctFormat == false) {
			System.out.println("Enter the contact's number");
			String number = scanner.nextLine();
			if(formatNum(number) != "incorrect format") {
				correctFormat = true;
				number = formatNum(number);
				Contact contact = new Contact(name, number);
				mobilePhone.addContact(contact);
				System.out.println("Contact has been successfully added");
			} else {
				System.out.println("Please enter a number in the correct format you bum");
			}
		}
	}
	
	public static void searchContact() {
		System.out.println("Please enter the contact's name");
		String name = scanner.nextLine();
		mobilePhone.getContactInfo(name);
	}
	
	private static String formatNum(String number) {
		if(number.indexOf("-") == 3 && number.lastIndexOf("-") == 7 && number.length() == 12) {
			String firstPartPhoneDigits = number.substring(0, 3);
			String middlePartPhoneDigits = number.substring(4, 7);
			String lastPartPhoneDigits = number.substring(8, 12);
			
			if(firstPartPhoneDigits.matches("[0-9]+") && middlePartPhoneDigits.matches("[0-9]+")
					 && lastPartPhoneDigits.matches("[0-9]+")) {
				return number;
			} else {
				return "incorrect format";
			}
		} else if (number.indexOf("-") == 3 && number.length() == 8) {
			String firstPartPhoneDigits = number.substring(0, 3);
			String lastPartPhoneDigits = number.substring(4, 8);
			if(firstPartPhoneDigits.matches("[0-9]+") && lastPartPhoneDigits.matches("[0-9]+")) {
				return number;
			} else {
				return "incorrect format";
			}
		} else if(number.length() == 10) {
			if(number.matches("[0-9]+")) {
				String firstPartPhoneDigits = number.substring(0, 3);
				String middlePartPhoneDigits = number.substring(3, 6);
				String lastPartPhoneDigits = number.substring(6, 10);
				number = firstPartPhoneDigits + "-" + middlePartPhoneDigits + "-" + lastPartPhoneDigits;
				return number;
			} else {
				return "incorrect format";
			}
		} else if (number.length() == 7) {
			if(number.matches("[0-9]+")) {
				String firstPartPhoneDigits = number.substring(0, 3);
				String lastPartPhoneDigits = number.substring(3, 7);
				return firstPartPhoneDigits + "-" + lastPartPhoneDigits;
			}
		}
		return "incorrect format";
	}

}
