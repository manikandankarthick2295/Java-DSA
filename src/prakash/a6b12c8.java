package inbox;

public class a6b12c8 {
	public static void main(String[] args) {
		String input = "a6b12c8";
		int i = 0;
		while (i < input.length()) {
			char ch = input.charAt(i++);
			int num = 0;
			while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				num = num * 10 + (input.charAt(i) - 48);
				i++;
			}
			for (int j = 0; j < num; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
