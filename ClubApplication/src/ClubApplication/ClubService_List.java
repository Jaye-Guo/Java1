package ClubApplication;

import java.util.ArrayList;
import java.util.List;

public class ClubService_List {
	List<Member> memberList = new ArrayList<>();
	private int currentnumber = 1;
	
	public Member addMember(String surname, String firstname, String secondname) {
		Member member = new Member(surname, firstname, secondname, currentnumber);
		memberList.add(member);
		currentnumber++;
		return member;
	}
	
	public Member getMember(int memberNumber) {
		for (Member member : memberList) {
			if(memberNumber == member.GetMemberNumber()) {
			return member;}
			}
		return null;
}
	
	public void removeMember(int memberNumber) {
		memberList.remove(memberNumber);
	}
	
	public void showMemebr() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
	

}
