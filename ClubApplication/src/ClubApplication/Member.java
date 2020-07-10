package ClubApplication;

public class Member extends Person {
	private int memberNumber;
	
	public Member(String surname, String firstname, String secondname, int nummember) {
		super(surname, firstname, secondname);
		this.memberNumber = nummember;
	}
    
	public int GetMemberNumber() {
		return memberNumber;
	}
	
	@Override
	public String toString() {
		return "membernumber=" + memberNumber + "-" + super.toString();
	}
	
	public void Show() {
        String fullName = memberNumber +" " + firstname;
        if (secondname != null) {
            fullName += " " + secondname;
        }
        fullName += " " + surname;
        System.out.println (fullName);
    }
}
