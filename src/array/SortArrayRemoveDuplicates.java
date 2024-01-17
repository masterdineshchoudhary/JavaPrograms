// IMP PROGRAM
// Program to Sort array and remove duplicates

package array;
import java.util.TreeSet;

public class SortArrayRemoveDuplicates {

	public static void main(String[] args) {
		Integer[] arr = {10,10,50,20,45,60,25,25,90};
		TreeSet<Integer> tree = new TreeSet<Integer>();

		for(int i = 0; i< arr.length; i++) {
		    tree.add(arr[i]);
		}

		arr = new Integer[tree.size()];
		tree.toArray(arr);
		for(int i = 0; i< arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
