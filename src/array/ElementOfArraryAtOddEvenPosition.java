package array;

public class ElementOfArraryAtOddEvenPosition {
	public static void main(String[] args) {
		int arr[] = new int[]{1, 2, 3, 4, 5};
		System.out.print("At even position ");
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("At odd position ");
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}