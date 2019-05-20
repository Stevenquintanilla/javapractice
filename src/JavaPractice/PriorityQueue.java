package javapractice;

public class PriorityQueue {
	
	private int MAX;
	private int[] arr;
	private int nItems;
	
	public PriorityQueue() {
		MAX = 10;
		arr = new int[MAX];
		nItems = 0;
	}
	
	public void insert(int val) {
		if(nItems == 0) {
			arr[0] = val;
			nItems++;
		}
		
		for(int i = nItems - 1; i >= 0; i--) {
			if (val > arr[i]) {
				arr[i + 1] = arr[i];
			} else {
				break;
			}
		}
	}

}
