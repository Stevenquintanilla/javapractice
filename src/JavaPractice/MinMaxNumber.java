package javapractice;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int min = 0;
		int max = 0;
		boolean userContinue = true;
		boolean firstRun = true;

		System.out.print("Enter a number: ");
		int userNum = scanner.nextInt();
		System.out.print("Enter another number: ");
		int userNumTwo = scanner.nextInt();
		scanner.nextLine();
		if (userNum > userNumTwo) {
			min = userNumTwo;
			max = userNum;
		} else if (userNum < userNumTwo) {
			min = userNum;
			max = userNumTwo;
		} else {
			min = userNum;
			max = userNum;
		}

		do {
			boolean correctResponse = false;
			if (firstRun != true) {
				System.out.println("Enter a number: ");
				userNum = scanner.nextInt();
				System.out.println("Enter another number: ");
				userNumTwo = scanner.nextInt();
				scanner.nextLine();

				if (userNum < min) {
					min = userNum;
				} else if (userNum > max) {
					max = userNum;
				}

				if (userNumTwo < min) {
					min = userNumTwo;
				} else if (userNumTwo > max) {
					max = userNumTwo;
				}
			}

			System.out.println("Current min is: " + min);
			System.out.println("Current max is: " + max);

			  do {
				System.out.println("Would you like to continue? Y/N");
				String userResponse = scanner.nextLine();
				if (userResponse.equalsIgnoreCase("Y")) {
					correctResponse = true;
					firstRun = false;
				} else if (userResponse.equalsIgnoreCase("N")) {
					userContinue = false;
					correctResponse = true;
				}
			}while (correctResponse == false);
		} while (userContinue == true);
		
		scanner.close();
	}
}
