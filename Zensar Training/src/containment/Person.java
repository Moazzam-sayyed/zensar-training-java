package containment;

public class Person {
	
	int id;
	String name;
	Vehicle v;

	
	public Person(int id, String name, Vehicle v) {
		super();
		this.id = id;
		this.name = name;
		this.v = v;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Vehicle getV() {
		return v;
	}


	public void setV(Vehicle v) {
		this.v = v;
	}

}
