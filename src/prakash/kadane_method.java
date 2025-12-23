package inbox;

import java.util.Scanner;

public class kadane_method {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = { -3,2,8,-4,-2 };
		int curr_sum = a[0], max_sum = a[0];
		for (int i = 1; i < a.length; i++) {
			curr_sum = Math.max(a[i], a[i]+curr_sum);
			max_sum = Math.max(max_sum, curr_sum);
		}
		System.out.println(max_sum);
	}

}
