package ClubApplication;

public class Facility {
	private String name;
	private String des;
	
	public Facility(String name, String des) {
		this.name = name;
		this.des = des;
	}
	
	public Facility(String name) {
		this (name, null);
	}
	
	public String getName() {
		return name;
	}

	public String getDes() {
		return des;
	}

	public void Show() {
        String fullName = name;
        if (des != null) {
            fullName += " (" + des + ")";
        }
        System.out.println (fullName);
    }
	
	@Override
	public String toString() {
		return "Facility [name=" + name + ", Description=" + des + "]";
	}
}
