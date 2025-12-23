package inbox;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class freq_in_map2 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String s="statistics";
		char[]a=s.toCharArray();
		Map<Character,Integer>m=new LinkedHashMap();
		for (char c : a) {
			m.put(c, m.getOrDefault(c,0)+1);
		}
		for (Map.Entry<Character, Integer>ref : m.entrySet()) {
			if (ref.getValue()==1) {
				System.out.println(ref.getKey());
				break;
			}
		}
	}
}


