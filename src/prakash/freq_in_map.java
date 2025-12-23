package inbox;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class freq_in_map {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s="programming";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		char[]a=s.toCharArray();
		for (char c : a) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
	}

}
