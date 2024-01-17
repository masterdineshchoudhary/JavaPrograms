package array;

public class LargestSmallestElementInArray {
	public static void main(String[] args) {
		int arr[] = new int[]{25, 11, 7, 75, 56};
		int max=arr[0], min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}