/************************************************************
 * 		  Sacramento State book store shopping cart 		*
 *															*
 * Name:													*
 * Ivince Pajarin											*
 * Kimhieng Tiv												*
 * Saul Chavez												*
 * Marco Pablo												*
 * Duy Huynh												*
 * Kurt Danilson											*
 ************************************************************/


public class SacStateShoppingCart {    
	
	public static void main(String[] args) {        
		
		Catalog list = new Catalog("Bookstore Shopping Cart");        
		list.add(new Item("Sacramento State Notebook 70-Sheet", 3.79, 10, 30.00));        
		list.add(new Item("Hornets #2 Round Pencil", 0.95, 10, 8.99));        
		list.add(new Item("Sacramento State Cap", 22.00));        
		list.add(new Item("Hydro Flask Bottle 32 oz Wide Mouth Lilac", 39.95));        
		list.add(new Item("Apple Airpods 2nd Generation with Case", 159.99));        
		list.add(new Item("Sacramento State 8.5'' x 11'' Windsor Diploma Frame", 215.99));        
		list.add(new Item("Hooded Sweatshirt", 58.00));      
		list.add(new Item("Sacramento State 20'' x 20'' Pillow", 196.00));        
		list.add(new Item("Sacramento State Shorts", 42.00));        
		list.add(new Item("Hornets Keystrap", 3.95, 10, 35.00));        
		list.add(new Item("Hornets Sticker Sheet", 7.95, 20, 150.00));
		list.add(new Item("Socks", 8.00, 20, 150));
		
		ShoppingFrame f = new ShoppingFrame(list);        
		f.setVisible(true); 
		f.setResizable(false);
		
	}

}