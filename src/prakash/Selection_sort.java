package inbox;

import java.util.Arrays;

public class Selection_sort {
	public static void main(String[] args) {
		int[]a= {50,40,30,20,10};
		System.out.println(Arrays.toString(a));
		int min=0;
		for (int i = 0; i < a.length-1; i++) {
			min=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
