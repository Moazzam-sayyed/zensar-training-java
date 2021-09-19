package containment2;

public class Rifill {
	String inkColor;
	int length;
	Nib nib;
	
	
	public Rifill()
	{
		
	}
	
	public Rifill(String inkColor, int length, Nib nib) {
		super();
		this.inkColor = inkColor;
		this.length = length;
		this.nib = nib;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}


	
}
