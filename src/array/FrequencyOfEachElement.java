package array;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,8,3,2,2,2,5,1};
		int fr[] = new int[arr.length];
		int visited = -1;
		for(int i=0;i<arr.length;i++) {
			int count =1;
			for(int j=i+1; j<arr.length; i++) {
				if (arr[i]==arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (arr[i]!=visited) {
				fr[i] = count;
			}
		}
		System.out.println("ele   |    freq");
		for(int i=0; i<fr.length; i++) {
			if (fr[i]!=visited) {
				System.out.print(arr[i]    |   fr[i]);
			}
		}
	}
}
