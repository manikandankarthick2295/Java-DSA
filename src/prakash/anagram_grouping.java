package inbox;

public class anagram_grouping {
		public static String sort(String s) {
			char[]a=s.toCharArray();
			String ans="";
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length-1; j++) {
					if (a[j]>a[j+1]) {
						char temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				ans=ans+a[i];
			}
			return ans;
		}
		public static void main(String []args) {
			String[]a= {"rat","tar","art","top","pot","opt","hello"};
			boolean[]b=new boolean[a.length];
			for (int i = 0; i < a.length; i++) {
				if (b[i]) {
					continue;
				}
				String key=sort(a[i]);
				System.out.print("{"+a[i]);
				b[i]=true;
				for (int j = i+1; j < a.length; j++) {
					if (!b[j]&&sort(a[j]).equals(key)) {
						System.out.print(","+a[j]);
						b[j]=true;
					}
				}
				System.out.println("}");
			}
		}
}
