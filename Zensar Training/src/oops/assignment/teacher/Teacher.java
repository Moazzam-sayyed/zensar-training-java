package oops.assignment.teacher;

public abstract class Teacher {
	int Tid;
	String Tname;
	long MobileNo;   
	
	abstract void salary();

	public Teacher(int tid, String tname, long mobileNo) {
		Tid = tid;
		Tname = tname;
		MobileNo = mobileNo;
	}
	public void showInfo()
	{
		System.out.println("Teacher ID:"+Tid);
		System.out.println("Name: "+Tname);
		System.out.println("Mobile Number:"+MobileNo);
	}
	
	
}
