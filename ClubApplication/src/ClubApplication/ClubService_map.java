package ClubApplication;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClubService_map {
	private Map<String, Facility> facilityList = new HashMap<>();
	
	public Facility addFacility(String name, String des) {
		Facility fc = new Facility(name, des);
		facilityList.put(name, fc);
		return fc;
	}
	
	public void removeFacility(String name) {
		facilityList.remove(name);
	}
	
	public Facility getFacility(String name) {
		Facility facility = facilityList.get(name);
		if (facility != null) {
		return facility;
		}
		return null;
	}
	
	public void showFacilities() {
		Set<String> facilities = facilityList.keySet();
		for (String facility : facilities) {
			System.out.println(facilityList.get(facility));
		}
	}

	public Collection<Facility> getFacilities() {
		return facilityList.values();
	}
}
