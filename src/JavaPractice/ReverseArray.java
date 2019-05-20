package javapractice;

import java.util.Arrays;

public class ReverseArray {

	public static int[] reverse(int[] array) {
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[]{22, 33, 11, 38, 21, 1, 99, 5};
		System.out.println(Arrays.toString(reverse(array)));
	}
}
