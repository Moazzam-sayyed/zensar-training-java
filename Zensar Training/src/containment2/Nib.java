package containment2;

public class Nib {
	String materialType;
	int width;
	
	public Nib()
	{
		
	}
	public Nib(String materialType, int width) {
		super();
		this.materialType = materialType;
		this.width = width;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
