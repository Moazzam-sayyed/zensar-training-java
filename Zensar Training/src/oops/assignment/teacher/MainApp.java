package oops.assignment.teacher;

public class MainApp {

	public static void main(String[] args) {
		Teacher salaryBased = new SalaryBased(20,"Deepa",987654321,3000);
		salaryBased.showInfo();
		salaryBased.salary();

		Teacher hourlyBased = new HourlyBased(22,"Balaji",987456321,2000,3);  //HourlyBased object
		hourlyBased.showInfo();
		hourlyBased.salary();
	}

}
