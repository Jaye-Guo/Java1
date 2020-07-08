package set_n_hashset;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
	//Set<E> is interface and HashSet<E> is the real implementation
	Set<Student> studentSet = new HashSet<>();
	
	public void addStudent(Student student) {
		studentSet.add(student);
	}
	
	public void displayAll() {
		for (Student student : studentSet) {
			System.out.println(student);
		}
	}
}
