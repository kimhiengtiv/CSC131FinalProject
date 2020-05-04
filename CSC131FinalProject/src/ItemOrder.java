// ItemOrder class for the shopping cart 

public class ItemOrder {
	
	// The field of the ItemOrder object 
	private Item item; 
	private int quantity; 
	
	
	/**
	 * Constructor with item and quantity. 
	 * @param item to be added. 
	 * @param quantity of the item to be order. 
	 */
	public ItemOrder(Item item, int quantity) {
		
		this.item = item; 
		this.quantity = quantity;
	
	}
	

	/**
	 * Accessor that returns the price of the item. 
	 * @return the price of the item with the given quantity. 
	 */
	public double getPrice() { 
		
		return item.priceFor(quantity); 
		
	}
	
	
	/**
	 * Accessor that returns the information about the item including name and prices. 
	 * @return the item information. 
	 */
	public String getItem() { 
		
		return item.toString(); 
		
	}
	
}
