package collection;
import java.util.Comparator;

public class CompareById implements Comparator<Student>{
		  
	    // override the compare() method
	    public int compare(Student s1, Student s2)
	    {
	        if (s1.studentID == s2.studentID)
	            return 0;
	        else if (s1.studentID > s2.studentID)
	            return 1;
	        else
	            return -1;
	    }
	    
	    
	    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

	    	public int compare(Student s1, Student s2) {
	    	   String StudentName1 = s1.getStudentname().toUpperCase();
	    	   String StudentName2 = s2.getStudentname().toUpperCase();

	    	   //ascending order
	    	   return StudentName1.compareTo(StudentName2);

	    	   //descending order
	    	   //return StudentName2.compareTo(StudentName1);
	        }};

}
