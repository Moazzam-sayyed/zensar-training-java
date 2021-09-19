package containment;

public class Item {
	
	String itemName;
	int quantity;
	int price;
	public Item(String itemName, int quantity, int price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
