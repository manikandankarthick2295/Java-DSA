package inbox;

import java.util.Arrays;

public class left_shift {

	public static void main(String[] args) {
		
		int[]a= {10,20,30,40};
		int n=3;
		for (int i = 0; i < n; i++) {
			int first=a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}

}
