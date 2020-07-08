package basic;

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricNumber == null) ? 0 : matricNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (matricNumber == null) {
			if (other.matricNumber != null)
				return false;
		} else if (!matricNumber.equals(other.matricNumber))
			return false;
		return true;
	}
}
