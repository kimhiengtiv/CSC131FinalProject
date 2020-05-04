// Shopping cart for Sac State book store 

import java.util.*;	

public class ShoppingCart {
	
	// The field of the ShoppingCart object 
	private ArrayList<ItemOrder> shoppingCart;
	private double total; 
	
	
	/**
	 * Constructor of the ShoppingCart. 
	 */
	public ShoppingCart() { 
		
		shoppingCart = new ArrayList<ItemOrder>();
		
	}
	
	
	/**
	 * Mutator method that add items into the shopping cart.
	 * @param item order that will be added to the shopping cart. 
	 */
	public void add(ItemOrder item) { 
		
		String name = item.getItem(); 
		String n = " "; 
		boolean valid = true; 
		int index = 0; 
		
		// For loop to adds an item order to the list, replacing any previous order for this item with the new order
		for (int i = 0; i < shoppingCart.size(); i++) { 
			ItemOrder s = shoppingCart.get(i);
			n = s.getItem(); 
			if (name.equals(n)) { 
				index = i; 
				valid = false; 
				i = shoppingCart.size();
			}
		}
		
		// If/else statement to add the item 
		if (name.equals(n)) { 
			shoppingCart.set(index, item); 
		} else {
			shoppingCart.add(item); 
		} 
		
		// Update the total cost 
		setTotal(); 
		
	}
	
	
	/**
	 * Mutator method that sets whether or not this order gets a discount. 
	 * @param value that determines whether or not the order gets a discount. 
	 */
	public void setDiscount(boolean value) { 
		
		// Update the total cost 
		setTotal(); 
		
		// If statement to calculate the discount 
		if (value) { 
			total = total * 0.90; 
		}
		
	}
	
	
	/**
	 * Mutator method that calculate the total cost of the items in the shopping cart. 
	 */
	private void setTotal() { 
		
		// Set total to 0 
		total = 0;
		
		// Calculate the new total cost and update the total field 
		for (int i = 0; i < shoppingCart.size(); i++) { 
			ItemOrder item = shoppingCart.get(i); 
			total += item.getPrice(); 
		}
				
	}
	
	
	/**
	 * Accessor method that return the total cost of the items in the shopping cart. 
	 * @return the total price of all the items in the shopping cart. 
	 */
	public double getTotal() { 
		
		return total; 
		
	}
	
}
	
