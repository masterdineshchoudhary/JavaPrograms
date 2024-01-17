package array;

import java.util.Arrays;
// Two arrays are said to be equal if the arrays have equal number of elements and all corresponding pairs of elements in two arrays are equal. 
// In the other words, two arrays are said to be equal if both the arrays have same elements in the same order. 

public class EqualityOfTwoArrays {
    public static void main(String[] args) {

        // Method 1
    	// Iterative
    	// This method will be time consuming if the arrays have lots of elements. This method is not recommended to check the equality of two arrays if the arrays are big in size
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,6,5};
        boolean EqualorNot = true;
        if(arr1.length == arr2.length){
            for (int i=0;i<arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    EqualorNot = false;
                }
            }
        } else {
            EqualorNot = true;
        }
        if (EqualorNot) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Not Equal");
        }

        // Method 2
        // Using equals() of Array class
        System.out.println();
        String s1[] = {"java", "python"};
        String s2[] = {"java", "ruby"};
        String s3[] = {"java", "python"};
        String s4[] = {"python", "java"};
        System.out.println(Arrays.equals(s1, s2)); // false
        System.out.println(Arrays.equals(s2, s3)); // false
        System.out.println(Arrays.equals(s1, s3)); // true
        System.out.println(Arrays.equals(s1, s4)); // unsorted - false
        // If you want to compare two arrays which have same number of elements and same set of elements but in different positions
        Arrays.sort(s1);
        Arrays.sort(s4);
        System.out.println(Arrays.equals(s1, s4)); // sorted - true

        // Method 3
        // Using Arrays.deepEquals()
        // checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method
        // Because, deepEquals() performs deep comparison of both the arrays.
        System.out.println();
        String m1[][] = {{"java", "python"}, {"c++", "ruby"}};
        String m2[][] = {{"java", "python"}, {"c++", "ruby"}};
        String m3[][] = {{"python", "java"}, {"ruby", "c++"}};
        System.out.println(Arrays.deepEquals(m1, m2));
        System.out.println(Arrays.deepEquals(m1, m3));
        System.out.println(Arrays.deepEquals(m2, m3));
    }
}
