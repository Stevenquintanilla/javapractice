package javapractice;

import java.util.Scanner;

public class ScannerSum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		do {
			System.out.print("Enter a number to add to the current sum : " + sum + "\n");
			sum += scanner.nextInt();
			counter++;
		} while(counter < 10);
		
		System.out.println("Total sum is: " + sum);
		scanner.close();
	}
}
