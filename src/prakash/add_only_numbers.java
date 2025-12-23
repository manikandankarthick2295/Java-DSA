package inbox;

public class add_only_numbers {
	public static void main(String[] args) {
		String s="a1byr1t12c10";
		String temp="";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='0'&&ch<='9') {
				temp+=ch;
			}else if (!temp.equals("")) {
				sum+=Integer.parseInt(temp);
				temp="";
			}
		}
		if (!temp.equals("")) {
			sum+=Integer.parseInt(temp);
		}
		System.out.println(sum);
	}
}
