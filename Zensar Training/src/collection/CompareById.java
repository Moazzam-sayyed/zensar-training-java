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

}
