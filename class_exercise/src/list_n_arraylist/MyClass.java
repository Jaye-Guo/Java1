package list_n_arraylist;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	//2. Since List and other collection classes are generic. 
	//We need to specify the type.
	//In this case, the type is Student
	List<Student> studentList = new ArrayList<>();
	//List is just interface and ArrayList is a real implementation. 
	//We need to use implementation when instantiating instances
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void displayAll() {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

}
