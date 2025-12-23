package inbox;

public class reverseString {
	public static void main(String[] args) {
		String s="hi@how#are";
		char[]a=s.toCharArray();
		int l=0,r=a.length-1;
		while (l<=r) {
			
		if (isitletter(a[l])&&isitletter(a[r])) {
			char temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		else if (!isitletter(a[l])) {
			l++;
		}
		else if (!isitletter(a[r])) {
			r--;
		}
		}
		System.out.println(a);
}
	public static boolean isitletter(char data)
	{
		return data>='a'&&data<='z'||data>='A'&&data<='Z';
	}
}
