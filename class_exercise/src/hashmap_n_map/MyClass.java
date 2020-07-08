package hashmap_n_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyClass {
	Map<String, Student> mToStudents = new HashMap<>();
	
	public void addStudent(String studentNumber, Student student) {
		mToStudents.put(studentNumber, student);

	}
	public void displayAll() {
			Set<String> matrics = mToStudents.keySet();
			for (String matric : matrics) {
				System.out.println(mToStudents.get(matric));
			}
		}
	
	public Student getStudent(String number) {
		return mToStudents.get(number);
	}
	
	public void updateStudent(String number, String newName) {
		Student student = mToStudents.get(number);
		if(student != null) {
			student.setName(newName);
		}
	}
}
