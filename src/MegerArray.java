import java.util.Arrays;

public class MegerArray {
//    Question 1: Concatenate Two Arrays in O(n)
//    Problem Statement
//    Write a Java program to concatenate two integer arrays into a single array in O(n) time complexity, where n is the total number of elements in both arrays.
//    Input Format
//    Two integer arrays A and B
//    Output Format
//    A single integer array containing all elements of A followed by all elements of B
//            Example
//    Input
//    A = [1, 2, 3]B = [4, 5, 6]
//    Output
//[1, 2, 3, 4, 5, 6]
//    Constraints
//    Do not use built-in collection utilities for concatenation
//    Time complexity must be O(n)
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
//        int length = a.length+b.length;
        int[]c = new int[a.length+b.length];
        //Time com O(n+m)
//        for(int i = 0 ; i<(a.length+b.length);i++){
//            if(i<a.length){
//                c[i] = a[i];
//            } else {
//
//                c[i] = b[i-(a.length)];
//            }
//        }

        //time comp O(n)
        int count = 0;
        for(int i = 0 ;i<a.length; i++){
            c[count++] = a[i];
        }
        for(int j = 0 ; j<b.length; j++){
            c[count++] = b[j];
        }
        System.out.println(Arrays.toString(c));

    }
}
