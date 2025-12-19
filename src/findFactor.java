import java.util.ArrayList;
import java.util.List;

public class findFactor{
    public static void main(String[] args) {
        //find factors
//        int count  = 0;
//        int n=25;
//        for(int i = 1;(i*i)<=n;i++){
//            if(n%i==0){
//                if(n/i==i){
//                    count++;
//                } else {
//                    count+=2;
//                }
//            }
//        }
//
        int n = 20;
        int count = 0;
        int prime = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ;
                j*j<=i;j++){
                if(i%j==0){
                    if(i/j==j){
                        count++;
                    } else {
                        count+=2;
                    }
                }
            }
            if(count == 2){
                l.add(i);
                prime++;

            }
            count = 0;
        }
        System.out.print("The Prime numer are "+ l);
        System.out.println();
        System.out.println("the count of prime number are: "+prime);
    }
}
