package zensar_assignment;

public class Employee {
	private int id;
	private String name;
	private long salary;
	
	
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


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("moazzam");
		System.out.println(employee1.getName());
	}

}
