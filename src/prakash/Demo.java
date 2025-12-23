package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 1,2,0,0,1, 0, 1, 0, 2, 2 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != 2 && a[j] == 2) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] != 2 && a[i] == 0&&a[j] == 1) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
