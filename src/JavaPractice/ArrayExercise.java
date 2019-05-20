package javapractice;

import java.util.Scanner;

public class ArrayExercise {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static int[] bubbleSort(int[] array) {
		//Descending bubble sort
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j + 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Array has been sorted in descording order");
		return array;
	}
	
	public static int[] getInteger(int noOfIntergers) {
		int [] userArray = new int[noOfIntergers];
		System.out.println("Enter " + noOfIntergers + " integers");
		for(int i = 0; i < userArray.length; i++) {
			userArray[i] = scanner.nextInt();
		}
		
		return userArray;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element of " + i + " is " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] userArray = getInteger(5);
		bubbleSort(userArray);
		printArray(userArray);
		
	}

}
