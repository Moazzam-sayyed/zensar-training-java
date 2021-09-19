package zensar_assignment;

public class Area {
	
	int area(int length,int width)
	{
		int area_result = length * width;
		System.out.println("Are of rectangle is:"+area_result);
		return area_result;
	}
	
	int area(int length)
	{
		int area_result = length * length;
		System.out.println("Are of Square is:"+area_result);
		return area_result;
	}
	double area(double redius)
	{  
		final  double Pi=3.14;
		double area_result = Pi*redius*redius;
		System.out.println("Are of Circle is:"+area_result);
		return area_result;
	}
	
	public static void main(String[] args) {
		
		Area area_object = new Area();
		area_object.area(10,20);
		area_object.area(10);
		area_object.area(10.0);
	
	}


}
