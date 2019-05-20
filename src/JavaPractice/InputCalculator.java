package javapractice;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		int numberOfInputs = 0;

		long average = 0;
		Scanner scanner = new Scanner(System.in);
		boolean hasInt = false;
		boolean firstRun = true;

		while (true) {
			System.out.println("Enter a number: ");
			hasInt = scanner.hasNextInt();

			if (hasInt) {
				sum += scanner.nextInt();
				numberOfInputs++;
				average = Math.round((double) (sum / numberOfInputs));
			} else {
				if (firstRun) {
					System.out.println("SUM = XX AVG = YY");
				} else {
					System.out.println("SUM = " + sum + " AVG = " + average);
				}
				break;
			}
			firstRun = false;
		}

		scanner.close();
	}

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}
}