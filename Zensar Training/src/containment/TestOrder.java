package containment;

public class TestOrder {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Moazzam","Mumbai");
		Item item = new Item("pen",10,200);
		Order order = new Order();
		
		order.setCustomerObject(c1);
		order.setItem(item);
		
		System.out.println(order.getCustomerObject().name);
		System.out.println(order.getItem().itemName);
		
	}

}
