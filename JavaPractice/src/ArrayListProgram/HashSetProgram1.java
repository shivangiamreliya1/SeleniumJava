package ArrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetProgram1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Ashu");
		hs.add("is");
		hs.add("good");
		hs.add("human");

		// List<String> list = new ArrayList<String> (hs);
		// Collections.sort(list);

		// System.out.println(list.get(3));

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}
