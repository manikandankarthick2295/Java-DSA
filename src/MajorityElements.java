public class MajorityElements {

//    Question 2: Find the Majority Element (Occurs More Than N/2 Times)
//    Problem Statement
//    Given an integer array of size N, find the element that occurs more than N/2 times in the array.
//    If no such element exists, return -1.
//    Input Format
//    An integer array A of size N
//    Output Format
//    An integer representing the majority element or -1 if none exists
//    Example 1
//    Input
//    A = [2, 2, 1, 2, 3, 2, 2]
//    Output
//2

    public static void main(String[] args) {

        int a[] ={2,1,2,3,2};
        System.out.println("majority elements : "+ majorityNumber(a));
    }

    private static int  majorityNumber(int[] a) {

        //Time com = O(n2)
//        int max = 0;
//        int num = 0;
//        for(int i = 0 ; i < a.length ; i++ ){
//            int count = 1;
//            for(int j = i+1 ; j < a.length ;j++){
//                if(a[i] == a[j]){
//                    count++;
//                }
//            }
//            if(count >= max){
//                max =  count;
//                num = a[i];
//            }
//        }
//        if(max > a.length/2){
//            return num;
//        } else {
//            return -1;
//        }

        //time com = O(n)
        //moore's algorithm.
        int count = 0;
        int  num = 0;
        for(int ans : a){
            if(count == 0){
                count = 1;
                num = ans;

            } else if (ans == num){
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for(int ans : a){
            if(ans == num){
                count++;
            }
        }
        return count>(a.length/2)? num:-1;
    }

}
