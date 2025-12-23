package inbox;

public class Spiral_program_2 {
	public static void main(String[] args) {
		int n=3;
		int[][] a = new int[n][n];
		int left=0,right=n-1;
		int top=0,bottom=n-1;
		int num=1;
		while (left<=right&&top<=bottom) {
			for (int i = left; i <=right; i++) {
				a[top][i]=num++;
			}
			top++;
			for (int i = top; i <=bottom; i++) {
				a[i][right]=num++;
			}
			right--;
			for (int i =right; i>=left; i--) {
				a[bottom][i]=num++;
			}
			bottom--;
			for (int i = bottom; i >=top; i--) {
				a[i][left]=num++;
			}
			left++;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
