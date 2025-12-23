package inbox;

public class sorting_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 41, 1, 14, 24 };
		int index = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < a[i - 1]) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}

}
