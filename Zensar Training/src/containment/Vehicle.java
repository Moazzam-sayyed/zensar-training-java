package containment;

public class Vehicle {
	
	int vid;
	String vname;
	
	

	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}

	

	public int getVid() {
		return vid;
	}



	public void setVid(int vid) {
		this.vid = vid;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}


	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle(12,"BMW");
		Vehicle vehicle2 = new Vehicle(12,"TATA");
		
		Person person = new Person(1,"Ajay",vehicle);
		Person person2 = new Person(2,"vijay",vehicle2);
		
		System.out.println(person.getV().vname);
		System.out.println(person2.getV().vname);

	}
}
