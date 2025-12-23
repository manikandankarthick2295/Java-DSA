package inbox;

import java.util.Arrays;

public class dictionarysort {
	public static void main(String[] args) {
		String[] a = { "54", "54", "483", "53164", "916" };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j].compareTo(a[j+1])>0) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
