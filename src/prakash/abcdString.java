package inbox;

public class abcdString {

	public static void main(String[] args) {

		String s="abcd";
		char[]a=s.toCharArray();
		String ans=" ";
		for (int i = 0; i <a .length; i++) {
			ans=" ";
			for (int j = i; j < a.length; j++) {
				ans=ans+a[j];
				System.out.print(ans+" ");
			}
			System.out.println();
		}
	}

}
