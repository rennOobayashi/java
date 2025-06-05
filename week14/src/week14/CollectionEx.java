package week14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionEx {
	public static void main(String[] args) {
		List<String> arrls = new ArrayList<>();
		arrls.add("Nayutan seijin");
		arrls.add("PinocchioP");
		arrls.add("Kairiki Bear");
		
		System.out.println("arrls.size - " + arrls.size());
		
		String item = arrls.get(0);
		System.out.println("arrls[0] - " + item);
		System.out.println();
		
		for(int i = 0; i < arrls.size(); ++i) {
			System.out.printf("arrls[%d] - %s\r\n", i, arrls.get(i));
		}
		System.out.println();
		
		arrls.remove(1);

		for(int i = 0; i < arrls.size(); ++i) {
			System.out.printf("arrls[%d] - %s\r\n", i, arrls.get(i));
		}
		System.out.println();
		
		List<String> vec = new Vector<>();
		
		vec.add("Mario Cart World");
		vec.add("Dongkingkong Bananza");
		vec.add("Metroid prime 4 Beyond");
		
		for (String s : vec) {
			System.out.println("nintendo - " + s);
		}
		System.out.println();
		
		List<String> linkedls = new LinkedList<>();
		linkedls.add("Apple");
		linkedls.add("Sony");
		linkedls.add("Samsung");
		linkedls.add("Sony");
		
		for (String s : linkedls) {
			System.out.println("Phone - " + s);
		}
		System.out.println();
		
		linkedls.remove("Sony");

		for (String s : linkedls) {
			System.out.println("Phone - " + s);
		}
		System.out.println();
		
		Set<String> set = new HashSet<String>();
		set.add("nintendo");
		set.add("Microsoft");
		set.add("Sony");
		set.add("nintendo");
		set.add("nintendo");
		set.add("nintendo");
		set.add("nintendo");
		set.add("nintendo");
		set.add("nintendo");

		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Mario");
		map.put("Hero", "Mario");
		map.put("name2", "Luigi");
		map.put("name", "Super Mario");
		
		Set<String> key = map.keySet();
		
		for (String s : key) {
			System.out.printf("[%s] %s\r\n", s, map.get(s));
		}
		System.out.println();
	}
}
