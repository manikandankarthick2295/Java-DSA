package inbox;

import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 40, 30 };
		System.out.println(Arrays.toString(a));
		int dup = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == Integer.MIN_VALUE) {
				continue;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					dup++;
					a[j] = Integer.MIN_VALUE;
				}
			}
		}
		int[] res = new int[a.length - dup];
		for (int i = 0, m = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				res[m++] = a[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
