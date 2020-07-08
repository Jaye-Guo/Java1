package basic;

public class MyClass {
	Student[] students;
	   int size;
	   
	   public MyClass() {
	      students = new Student[10];
	      size = 0;
	   }
	   
	   public void addStudent(Student student) {
	      students[size] = student;
	      size++;
	   }
	   
	   public void displayAll() {
	      for (int i = 0; i <size; i++) {
	         System.out.println(students[i]);
	      }
	   }
}
