package inbox;

public class Spiral_programming {
	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 2, 3 },
				 { 4, 5, 6 },
				 { 7, 8, 9 } 
			};
		int n=3;
		int left=0,right=a.length-1;
		int top=0,bottom=a.length-1;
		while (left<=right&&top<=bottom) {
			for (int i = left; i <=right; i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			for (int i = top; i <=bottom; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			for (int i =right; i>=left; i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			for (int i = bottom; i >=top; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
}
