package order_n_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {
	Set<Student> studentSet = new HashSet<>();
	public void addStudent(Student student) {
		studentSet.add(student);
	}
	
	public void diaplayAllOrderByStudentNumber() {
		List<Student> studentList = new ArrayList<>(studentSet);
	Collections.sort(studentList);
	
	for (Student student : studentList) {
		System.out.println(student);
	}
	}
	
}
