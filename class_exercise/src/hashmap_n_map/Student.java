package hashmap_n_map;

public class Student {
	private String matricNumber;
	private String name;

	public Student(String matricNumber, String name) {
		super();
		this.matricNumber = matricNumber;
		this.name = name;
	}

	public String getMatricNUmber() {
		return matricNumber;
	}

	public String getName() {
		return name;
	}

	public void setMatricNumber(String matricNumber) {
		this.matricNumber = matricNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + "(" + matricNumber + ")";
	}

}
