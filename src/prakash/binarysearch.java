package inbox;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = { 80, 90, 50, 60, 40, 20 };
		System.out.println(Arrays.toString(a));
		int key = sc.nextInt();
		if (solve(a, key)) {
			System.out.println("present");
		}
	}

	public static boolean solve(int[] a, int key) {
		Arrays.sort(a);
		int l = 0, r = a.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] == key) {
				return true;
			}
			if (key > a[m]) {
				l = m + 1;
			}
			if (key < a[m]) {
				r = m - 1;
			}

		}
		return false;
	}
}