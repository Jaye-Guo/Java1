package hashmap_n_map;

public class test_map {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		mc.addStudent("NUS000001", new Student("NUS000001", "Jaye"));
		mc.addStudent("NUS000002", new Student("NUS000002", "Joey"));
		mc.addStudent("NUS000003", new Student("NUS000003", "Jack"));
		mc.addStudent("NUS000004", new Student("NUS000004", "Collin"));
		mc.addStudent("NUS000005", new Student("NUS000005", "Bryant"));
		
		mc.updateStudent("NUS000004", "Joyce");

		mc.displayAll();

	}

}
