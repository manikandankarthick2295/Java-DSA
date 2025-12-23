package inbox;

import java.util.Scanner;

public class rdbms {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = "PrAkaSh";
		System.out.println(s);
		char[] res = solve(s);
		System.out.println(res);

	}

	public static char[] solve(String s) {
		char[] a = s.toCharArray();
		int l = 0, r = a.length - 1;
		while (l <= r) {
			if (a[l] >= 'a' && a[l] <= 'z') {
				a[l] -= 32;
			} else if (a[l] >= 'A' && a[l] <= 'Z') {
				a[l] += 32;
			}
			if (l != r) {

				if (a[r] >= 'a' && a[r] <= 'z') {
					a[r] -= 32;
				} else if (a[r] >= 'A' && a[r] <= 'Z') {
					a[r] += 32;
				}
			}

			char temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		return a;
	}
}
