import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlaternListOfListAndRemoveDup {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4),
                Arrays.asList(4, 5));

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i<list.size()-1 ; i++){

            List<Integer> inner = list.get(i);

            for(int j = 0; j<inner.size()-1;j++){
                set.add(inner.get(j));

            }
        }
        System.out.println(" the set values : "+set);
    }
}
