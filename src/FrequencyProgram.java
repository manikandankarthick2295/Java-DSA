import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyProgram {
    public static void main(String[] args) {
        /*ques: Given a string S, count the number of occurrences of each word.
            Words are separated by spaces and comparison is case-insensitive.
            Input
            S = "Java is great and Java is powerful"
        * */
        String s1 = "Java is great and Java is powerful";
        //using stream

//        Arrays.stream(s1.toLowerCase().split(" "))//used to get the vlaue into linked hashmap defalutly grouping by give hash map only
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//                .entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

        Arrays.stream(s1.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));

        //without stream
        String[] s = s1.toLowerCase().split(" ");
        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        for(String txt : s){
            if(map.containsKey(txt)){
                map.put(txt,map.get(txt)+1);
            } else {
                map.put(txt,1);
            }
        }
        map.forEach((k, v)-> System.out.println(k+" : "+v));
    }

}
