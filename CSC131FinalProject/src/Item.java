// Item class for the shopping cart 

import java.text.*; 

public class Item {
	
	// The field for the Item object 
	private String item; 
	private double price; 
	private int bulk; 
	private double bulkPrice; 
	
	
	/**
	 * Constructor with name and price. 
	 * @param item name. 
	 * @param price of the item. 
	 */
	public Item(String name, Double price) {
		
		this.item = name; 
		this.bulk = 0; 
		this.bulkPrice = 0.0; 
		
		// If statement if the price is negative 
		if (price < 0) { 
			throw new IllegalArgumentException(); 
		} else {
			this.price = price; 
		}
		
	}
	
		
	/**
	 * Constructor with name, price of each item, bulk quantity, and bulk price.
	 * @param name of the item. 
	 * @param price of the a single item. 
	 * @param the number of bulk of the item. 
	 * @param bulkPrice is the price of the item in bulk.
	 */
	public Item(String name, Double price, int bulk, double bulkPrice) { 
		
		this.item = name; 
		
		// If statement if the price is negative 
		if (price < 0 || bulk < 0 || bulkPrice < 0) { 
			throw new IllegalArgumentException(); 
		} else {
			this.price = price; 
			this.bulk = bulk; 
			this.bulkPrice = bulkPrice; 
		}
		
	}
		
	
    /**
     * An accessor that computes the price of the time with given quantity. 
     * @return the price for a given quantity. 
     */
    public double priceFor(int quantity) {  
    	
    	// If statement for when quantity is negative 
    	if (quantity < 0) {
    		throw new IllegalArgumentException(); 
    	// If there is bulk value 
    	} else if (quantity > bulk && bulk > 0) { 
    		int each = quantity % bulk;
    		quantity = quantity / bulk; 
    		double bulkCost = quantity * bulkPrice;
    		double eachCost = each * price; 
    		return bulkCost + eachCost;
    	// If the quantity is the same as the bulk amount 
    	} else if (bulk == quantity) {  
    		return bulkPrice; 
    	// If there is no bulk price 
    	} else { 
    		return this.price * quantity; 
    	}
	}
	
    
	/**
	 * An accessor method that returns the name of the item. 
	 * @return the name of the item. 
	 */
	public String getName() { 
		
		return item; 
		
	}
	
	
	/**
	 * This method prints the field about the Item object.
	 * @return string information of the Item object.  
	 */
	public String toString() { 
		
		// Set the format for the prices 
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		String singleItem = ""; 
		String inBulk = ""; 
		
		// If statements to return the item name, price per item or price for bulk 
		if (bulk == 0) { 
			return singleItem = item + ", " + nf.format(price); 
		} else { 
			singleItem = item + ", " + nf.format(price); 
			inBulk = " bulk item " + bulk + " for " + nf.format(bulkPrice); 
			return singleItem + inBulk; 
		}
		
	}
	
}

