package inbox;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int first=0,second=1;
			int n=10;
			for (int i = 0; i <=n; i++) {
				int third=first+second;
				first=second;
				second=third;
				System.out.print(third+" ");
			}
	}

}
