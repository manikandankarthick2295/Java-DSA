package inbox;

public class Sliding_window {
	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		int k = 4;
		int window_sum = 0, max_sum = 0;
		for (int i = 0; i < k; i++) {
			window_sum += a[i];
		}
		max_sum = window_sum;
		for (int i = k; i < a.length; i++) {
			window_sum += a[i] - a[i - k];
			max_sum = Math.max(window_sum, max_sum);
		}
		System.out.println(max_sum);
	}
}
