package week14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		
	}
}
