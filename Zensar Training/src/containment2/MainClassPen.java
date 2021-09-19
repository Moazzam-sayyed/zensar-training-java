package containment2;

public class MainClassPen {

	public static void main(String[] args) {
		
		
		//set values using setter
		Pen pen = new Pen();
		pen.setCapLength(4);
		pen.setBrand("Cello");
		
		pen.r = new Rifill();
		pen.r.setInkColor("Blue");
		pen.r.setLength(5);
		
		pen.r.nib = new Nib();
		pen.r.nib.setMaterialType("Steel");
		pen.r.nib.setWidth(1);
		
		//Display
		System.out.println(pen.getBrand());
		System.out.println(pen.getCapLength());
		System.out.println(pen.r.nib.getMaterialType());
		System.out.println(pen.r.nib.getWidth());
			
	}

}