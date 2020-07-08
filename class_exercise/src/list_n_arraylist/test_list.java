package list_n_arraylist;

/*import java.util.ArrayList;
import java.util.List;*/

import basic.MyClass;
import basic.Student;

public class test_list {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.addStudent(new Student("NUS000001", "Jaye"));
		mc.addStudent(new Student("NUS000002", "Joey"));
		mc.addStudent(new Student("NUS000003", "Jack"));
		mc.addStudent(new Student("NUS000004", "Collin"));
		mc.addStudent(new Student("NUS000005", "Bryant"));
		mc.addStudent(new Student("NUS000001", "Jaye"));
		//duplicate elements:
		//even new student have the same name with previous student,
		//will still be added to the list
		//either loop for check || use a set
		mc.displayAll();
	}
}

//
/*
 * public class test_list { public static void main(String[] args) {
 * List<String> list = new ArrayList<>(); list.add("I"); list.add(" ");
 * list.add("P"); list.add("P"); list.add("L"); list.add("E"); list.add("M");
 * list.add("O"); list.add("U"); list.remove("P"); list.remove("P"); list.add(3,
 * "O"); list.add(4, "V"); list.add(6, " "); list.remove("M"); list.add(7, "Y");
 * 
 * if (!list.isEmpty()) { System.out.println(list); } } }
 */