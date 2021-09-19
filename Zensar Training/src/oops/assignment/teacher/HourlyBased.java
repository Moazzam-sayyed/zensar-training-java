package oops.assignment.teacher;

public class HourlyBased extends Teacher {

 long rate_per_hr;
 int hrs;
 
 void salary()
 {
	 System.out.println(rate_per_hr*hrs);
 }
 
 
	public HourlyBased(int tid, String tname, long mobileNo, long rate_per_hr, int hrs) {
	super(tid, tname, mobileNo);
	this.rate_per_hr = rate_per_hr;
	this.hrs = hrs;
}


//	public static void main(String[] args) {
//		Teacher hourlyBased = new HourlyBased(22,"Balaji",987456321,2000,3);
//		hourlyBased.showInfo();
//		hourlyBased.salary();
//		
//	}

}
