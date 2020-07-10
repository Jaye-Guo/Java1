package ClubApplication;

public class Person {
	protected String surname;
	protected String firstname;
	protected String secondname;
		
	public Person(String surname, String firstname, String secondname) {
			this.surname = surname;
			this.firstname = firstname;
			this.secondname = secondname;
		}

	public String getSurname() {
		return surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSecondname() {
		return secondname;
	}
	
	public void Show() {
        String fullName = firstname;
        if (secondname != null) {
            fullName += " " + secondname;
        }
        fullName += " " + surname;
        System.out.println (fullName);
    }
	
	@Override
	public String toString() {
		return "Person [surname=" + surname + ", firstName=" + firstname
				+ ", secondName=" + secondname + "]";
	}
}

