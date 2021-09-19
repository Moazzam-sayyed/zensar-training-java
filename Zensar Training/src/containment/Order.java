package containment;

public class Order {
	
	int orderId;
	String date;
	private Customer customerObject;
	Item item;
	
	public Order()
	{
		
	}

	public Order(int orderId, String date, Customer customerObject, Item item) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.customerObject = customerObject;
		this.item = item;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomerObject() {
		return customerObject;
	}

	public void setCustomerObject(Customer customerObject) {
		this.customerObject = customerObject;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}


			
}
