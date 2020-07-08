package set_n_hashset;

public class Student {
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
	
	//hasdcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+studentNumber.hashCode();
		result = prime*result+name.hashCode();
		return result;
	}
	
	//equal (comparing) for object type using equal
	//for reference type using ==
	@Override
	public boolean equals(Object o) {
		Student another = (Student) o;
		if(studentNumber.equals(another.studentNumber)&&name.equals(another.name)) {
			return true;
		}
		return false;
	}
	
	
}
