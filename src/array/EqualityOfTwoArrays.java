package array;

import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {

        // Iterative Method
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

        System.out.println();
        // Using Arrays.equals() Method
        String s1[] = {"java", "python"};
        String s2[] = {"java", "ruby"};
        String s3[] = {"java", "python"};
        String s4[] = {"python", "java"};
        System.out.println(Arrays.equals(s1, s2)); // false
        System.out.println(Arrays.equals(s2, s3)); // false
        System.out.println(Arrays.equals(s1, s3)); // true
        System.out.println(Arrays.equals(s1, s4)); // unsorted - false
        Arrays.sort(s1);
        Arrays.sort(s4);
        System.out.println(Arrays.equals(s1, s4)); // sorted - true

        // Using Arrays.deepEquals() Method :
        // checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method
        System.out.println();
        String m1[][] = {{"java", "python"}, {"c++", "ruby"}};
        String m2[][] = {{"java", "python"}, {"c++", "ruby"}};
        String m3[][] = {{"python", "java"}, {"ruby", "c++"}};
        System.out.println(Arrays.deepEquals(m1, m2));
        System.out.println(Arrays.deepEquals(m1, m3));
        System.out.println(Arrays.deepEquals(m2, m3));
    }
}
