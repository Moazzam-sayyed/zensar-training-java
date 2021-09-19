package oops.assignment.teacher;

public class SalaryBased extends Teacher {
	
	int salary;
	
	
	public SalaryBased(int tid, String tname, long mobileNo, int salary) {
		super(tid, tname, mobileNo);
		this.salary = salary;
	}



	@Override
	void salary() {
		System.out.println("Salary:"+salary);
		
	}

}
