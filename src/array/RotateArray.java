package array;

class RotateArray {
    public static void main(String[] args) {
        int a[] = new int []{1,4,6,8};
        int n=2;
        for(int i=0;i<n;i++){
            int j, first=a[0];
            for( j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=first;
        }
        System.out.println("rotate");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
