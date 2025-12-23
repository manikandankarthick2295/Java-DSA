package inbox;

public class substring_search {
	public static void main(String[] args) {
		String str = "hello world";
		String sub = "world";
		boolean found = false;

		for (int i = 0; i <= str.length() - sub.length(); i++) {
			int j;
			for ( j = 0; j < sub.length(); j++) {
				if (str.charAt(i+j)!=sub.charAt(j)) {
					break;
				}
			}
			if (j==sub.length()) {
				System.out.println(i);
				found=true;
				break;
			}
		}
		if (!found) {
			System.out.println("not found");
		}
	}
}
