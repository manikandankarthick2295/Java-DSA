import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicte {
    public static void main(String[] args) {
        String str = "Java is great and Java is powerful";

        Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.toMap(
                k->k.toLowerCase(),
                k->k,
                (oldVal,newVal)->oldVal,
                LinkedHashMap::new))
                .values()
                .stream()
                .collect(Collectors.joining(" "));
//                .collect(Collectors.toSet());


        //Without Stream
        String[] st = str.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet();
        for(String ans : st){

            if(!set.contains(ans)){
                set.add(ans);
                sb.append(ans).append(" ");
            }
        }
        System.out.println("Removed duplicate sentence :"+ sb.toString());
    }
}
