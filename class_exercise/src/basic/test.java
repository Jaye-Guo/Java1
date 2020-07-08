package basic;

public class test {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.addStudent(new Student("NUS000001", "Jaye"));
		mc.addStudent(new Student("NUS000002", "Joey"));
		mc.addStudent(new Student("NUS000003", "Jack"));
		mc.addStudent(new Student("NUS000004", "Collin"));
		mc.addStudent(new Student("NUS000005", "Bryant"));

		mc.displayAll();

	}

}
