package order_n_sorting;

public class Student implements Comparable<Student> {
	private String name;
	private String studentNumber;
	
	public Student(String name, String studentNumber) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNumber=" + studentNumber + "]";
	}

	@Override
	public int compareTo(Student o) {
		return studentNumber.compareTo(o.studentNumber);
	}
	
	
}
