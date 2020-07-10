package ClubApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClubApplication {

	public static void main(String[] args) {

		//CURD Members using ArrayList
		ClubService_List club = new ClubService_List();
		
		Member mem1, mem2, mem3, mem4;
		
		mem1 = club.addMember("G", "J", "Y");
		mem2 = club.addMember("A", "B", "C");
		mem3 = club.addMember("H", "H", "H");
		mem4 = club.addMember("D", "D" , null);
		
		System.out.println ("Current Members:");
		club.showMemebr();
		 
		System.out.println("");
		
		int id = mem3.GetMemberNumber();
		System.out.println("deleting member" + id);
		club.removeMember(id);
		
		System.out.println("");
		
		System.out.println ("Current Members:");
		club.showMemebr();
		
		System.out.println("");
		
		System.out.println("find member");
		Member find = club.getMember(mem3.GetMemberNumber());
		System.out.println(find.toString());
		
		
		//CRUD facility using HashMap
		ClubService_map club2 = new ClubService_map();
		
		Facility fc1;
		System.out.println ("Current Facilities:");
		fc1 = club2.addFacility("gym", "public");
		club2.addFacility("pool", "private only");
		club2.addFacility("parkings", "residents and visitors");
		club2.addFacility("sky park", "residents only");
		club2.addFacility("management office", "staff only");
		club2.showFacilities();
		
		System.out.println("");
		
		System.out.println("removing facility");
		club2.removeFacility("gym");
		System.out.println("");
		club2.showFacilities();
		
		/*
		 * club.addFacility("Room1", "big floor window"); Facility room2 =
		 * club.addFacility("Room2", "on the tree"); club.addFacility("Room3",
		 * "above the sea"); club.addFacility("Room4", null);
		 * 
		 * club.showFacility();
		 * 
		 * System.out.println(""); System.out.println("Removing facility");
		 * 
		 * club.removeFacility("room5"); club.showFacility();
		 * 
		 * 
		 * System.out.println(); DateTimeFormatter df =
		 * DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		 * 
		 * try { Bookings booking1 = new Bookings(mem1, room2,
		 * LocalDateTime.parse("1-Aug-2007 09:00", df),
		 * LocalDateTime.parse("1-Aug-2007 07:00", df));
		 * 
		 * Bookings booking2 = new Bookings(mem2, room2,
		 * LocalDateTime.parse("2-Dec-2020 12:00", df),
		 * LocalDateTime.parse("3-Dec-2020 12:00", df));
		 * 
		 * booking1.show(); booking2.show(); System.out.println(booking2.toString());
		 * 
		 * if (booking1.overlap(booking2)) System.out.println("Correct: Overlaps"); else
		 * System.out.println("no overlap"); } catch(BadBookingException e){
		 * System.out.println(e.getMessage()); }
		 * 
		 */
 	}
}
