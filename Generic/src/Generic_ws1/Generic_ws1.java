package Generic_ws1;

import java.util.ArrayList;
import java.util.List;

public class Generic_ws1 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		Swap.swap(intList);
		for (Integer n : intList) {
			System.out.println(n);
		}
		
		List<String> strList = new ArrayList<>();
		strList.add("First");
		strList.add("Second");
		
		Swap.swap(strList);
		for (String n : strList) {
			System.out.println(n);
		}

	}

}
	class Swap{
		public static <T>void swap(List<T> list) {
			T tmp = list.get(0);
			list.set(0, list.get(1));
			list.set(1, tmp);
		}
	}