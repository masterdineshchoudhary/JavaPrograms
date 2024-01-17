package sorting;

public class LinearSearch {
	public static int search(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10,55,30,40,50,80,16};
		int key = 55;
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.search(arr, key));
	}
}