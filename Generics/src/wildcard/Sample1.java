package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {

		List<Object> list1 = new ArrayList<>();

		list1.add("String");
		list1.add(13);
		list1.add(false);

		List<String> list2 = new ArrayList<>();
		list2.add("String");

		List<Integer> list3 = new ArrayList<>();
		list3.add(11);

		foo(list1);
		foo(list2);
		foo(list3);

	}

	static void foo(List<?> myList) {

		for (Object elem : myList) {
			System.out.println(elem);
		}
	}

}
