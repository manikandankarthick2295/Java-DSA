package inbox;

import java.util.Scanner;

public class missing_number {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { 1, 3, 6, 8 };
		for (int i = 0, m = 1; i < a.length; i++, m++) {
			if (a[i] != m) {
				System.out.println(m + " ");
				i--;
			}
		}
	}
}
