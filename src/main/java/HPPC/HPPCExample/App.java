package HPPC.HPPCExample;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.ObjectArrayList;
import com.carrotsearch.hppc.ObjectObjectOpenHashMap;

/**
 * HPPC API Examples (HPPC: High Performance Primitive Collections for Java)
 * http://labs.carrotsearch.com/hppc.html
 * 
 * @author Ankit
 * 
 */
public class App {
	public static void main(String[] args) {

		intArayListExample();
		seperator();

		objectArrayListExample();
		seperator();

		objectObjectOpenHashMapExample();
		seperator();

	}

	private static void objectObjectOpenHashMapExample() {
		System.out.println("ObjectObjectOpenHashMap<String, Integer> Example");

		ObjectObjectOpenHashMap<String, Integer> hmp = new ObjectObjectOpenHashMap<String, Integer>();
		hmp.put("A", 1);
		hmp.put("B", 2);
		hmp.put("C", 3);
		hmp.put("D", 4);
		hmp.put("E", 5);
		hmp.put("F", 6);

		if (hmp.containsKey("E")) {
			System.out.println("The Hashset contains key E");
		} else {
			System.out.println("The Hashset doesn't  contains key E");
		}
		if (hmp.containsKey("LE")) {
			System.out.println("The Hashset contains key LE");
		} else {
			System.out.println("The Hashset doesn't  contains key LE");
		}
	}

	private static void objectArrayListExample() {
		System.out.println("ObjectArrayList<Object> Example");

		ObjectArrayList<Object> obj = new ObjectArrayList<Object>();

		obj.add("ankit");
		obj.add(5);
		obj.add(788.789);

		if (obj.contains("ankit1")) {
			System.out.println("The Arraylist contains the string ankit1");
		} else {
			System.out
					.println("The Arraylist doesn't contains the string ankit1");
		}

		if (obj.contains(788.789)) {
			System.out.println("The Arraylist contains the float 788.789");
		} else {
			System.out
					.println("The Arraylist doesn't contains the float 788.789");
		}
	}

	private static void intArayListExample() {
		System.out.println("IntArrayList Example");
		IntArrayList ar = new IntArrayList();

		ar.add(0);
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);

		if (ar.contains(6)) {
			System.out.println("The ArrayList contains key 6");
		} else {
			System.out.println("The ArrayList doesn't contains key 6");
		}

		if (!ar.contains(88)) {
			System.out.println("The ArrayList doesn't contains key 88");

		}

	}

	private static void seperator() {
		for (int i = 0; i < 45; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
}
