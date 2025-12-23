package inbox;

import java.util.*;

public class right_shift {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int n=3;
		for (int i = 0; i < n; i++) {
			int last=a[a.length-1];
			for (int j = a.length-1; j >0; j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println(Arrays.toString(a));
	}
}