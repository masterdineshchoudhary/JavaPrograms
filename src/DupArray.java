/**
 * Main
 */
public class DupArray {

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,2,4,5,3,5,7,9,8,8};
        System.out.println("Duplicate Elements : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.print(a[j]+" ");
                }
            }
            
        }
    }
}