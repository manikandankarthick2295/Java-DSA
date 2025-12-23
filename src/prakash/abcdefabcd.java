package inbox;

import java.util.Arrays;

public class abcdefabcd {

	public static void main(String[] args) {
		String s="abcdefabc";
		String ans="";
		char[]a=s.toCharArray();
		Arrays.sort(a);
		ans+=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]!=a[i-1]) {
				ans+=a[i];
			}
		}
		System.out.println(ans);
	}

}
