package array;

public class CopyElementsFromOneToAnother {
	public static void main(String[] args) {

		int a[] = new int[]{1,3,5};
    int b[] = new int[a.length];
    for(int i=0;i<a.length;i++){
        b[i]=a[i];
    }
    for (int i : b) {
        System.out.print(i+" ");
    }

		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		System.out.println("Array 1 Elements");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("\nArray 2 Elements");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}