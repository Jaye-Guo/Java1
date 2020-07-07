package ws5;

class Staff implements Comparable<Staff>{
	String id;
	String name;
	int grade;
	float salary;
		   
	Staff(String id, String name, int grade, float salary) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary; }
		   
	public String getId() {
		return id;
		}

	public void setId(String id) {
		this.id = id;
		}

	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
		}

	public int getGrade() {
		return grade;
		}

	public void setGrade(int grade) {
		this.grade = grade;
		}

	public float getSalary() {
		return salary;
		}

	public void setSalary(float salary) {
		this.salary = salary;
		}

	public String toString() {
	      return "Id: " + id + "\n" 
	            + "Name: " + name + "\n" 
	            + "Grade: " + grade + "\n" 
	            + "Salary: " + salary;  
		   }

	@Override
	public int compareTo(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}
}
