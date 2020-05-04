// Catalog class for the shopping cart 

import java.util.*;

public class Catalog {
	
	// The field for the Catalog object 
	private String name; 
	private ArrayList<Item> catalog; 
	
	
	/**
	 * Constructor with name 
	 * @param name of the catalog 
	 */
	public Catalog(String name) { 
		
		this.name = name; 
		this.catalog = new ArrayList<Item>(); 
		
	}
	
	
	/**
	 * Mutator method that add items to the catalog. 
	 * @param item to be added to the catalog. 
	 */
	public void add(Item item) {
		
		catalog.add(item); 
		
	}
	
	
	/**
	 * Accessor that returns how many item(s) is/are in the catalog. 
	 * @return the size of the catalog. 
	 */
	public int size() {
		
		return catalog.size();
		
	}
	
	
	/**
	 * Accessor that returns the item in the given index. 
	 * @param index of the item in the catalog. 
	 * @return the item in the given index. 
	 */
	public Item get(int index) {
		
		return catalog.get(index);
		
	}
	
	
	/**
	 * Accessor that returns the name of the catalog. 
	 * @return name of the catalog. 
	 */
	public String getName() { 
		
		return this.name; 
		
	}
	
	
}

