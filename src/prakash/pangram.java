package inbox;

public class pangram {

	public static void main(String[] args) {

		String s="the quick Brown Fox Jumps Over The LAZY Dog";
		if (pangram(s)) {
			System.out.println("pangram");
		}
	}
	public static boolean pangram(String s)
	{
		s=s.toLowerCase();
		s=s.trim();
		char[]a=s.toCharArray();
		boolean[]b=new boolean[26];
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=' ') {
				b[a[i]-'a']=true;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i]==false) {
				return false;
			}
		}
		return true;
	}

}
