package order_n_sorting;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		//integer can simply apply .sort() method
		int[] numbers = {2,4,3,6,8,1,7,5};
		
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.println(number + " ");
		}
		
		//to compare objects
		//implements interface Comparable<> (to find ><=)
		MyClass mc = new MyClass();
		mc.addStudent(new Student("Bryant", "NUS000005"));
		mc.addStudent(new Student( "Joey", "NUS000002"));
		mc.addStudent(new Student( "Collin", "NUS000004"));
		mc.addStudent(new Student("Jaye", "NUS000001"));
		mc.addStudent(new Student("Jack", "NUS000003"));
		
		mc.diaplayAllOrderByStudentNumber();
	}
	
}
