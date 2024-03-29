package array;

public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		int n=3;
		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
//		for (int i = 0; i < n; i++) {
//			int first=arr[0], j;
//			for (j = 0; j < arr.length-1; j++) {
//				arr[j] = arr[j+1];
//			}
//			arr[j] = first;
//		}
//		System.out.println();
//		System.out.println("Array after left rotation : ");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		--> 45123
		
		for (int i = 0; i < n; i++) {
			int last = arr[arr.length-1], j;
			for (j = arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.println();
		System.out.println("Array after right rotation : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
//		--> 34512
	}
}
