package inbox;

import java.util.Arrays;

class Merge_sort {
	public static void main(String[] args) {
		int[] a = { 7, 6, 5, 3, 2, 1 };

		System.out.println("Before sorting: " + Arrays.toString(a));
		divide(a, 0, a.length - 1);
		System.out.println("After sorting: " + Arrays.toString(a));
	}

	public static void divide(int[] a, int l, int h) {
		if (l >= h)
			return;

		int mid = (l + h) / 2;
		divide(a, l, mid); // divide left
		divide(a, mid + 1, h); // divide right
		merge(a, l, mid, h); // merge both
	}

	public static void merge(int[] a, int l, int mid, int h) {
		int left = l;
		int right = mid + 1;

		int[] k = new int[a.length];
		int m = 0;

		// Merge two halves
		while (left <= mid && right <= h) {
			if (a[left] < a[right]) {
				k[m++] = a[left++];
			} else if (a[right] < a[left]) {
				k[m++] = a[right++];
			} else { // if equal
				k[m++] = a[left++];
				right++;
			}
		}

		while (left <= mid) {
			k[m++] = a[left++];
		}

		while (right <= h) {
			k[m++] = a[right++];
		}

		// Copy sorted temp array back to original
		m = 0;
		for (int i = l; i <= h; i++) {
			a[i] = k[m++];
		}
	}
}