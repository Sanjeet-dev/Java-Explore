/*Create a class Product with properties like name,price,and quantity
 * Implement methods to display product information, 
 * calculate total cost for a given quantity, and check if the product is in stock.
 */
class Product{
	String name;
	int price;
	int quantity;
	
	// default constructor
	Product(){
	  System.out.println("constructor created..");
	}
	
	// parametrized constructor
	Product(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void productInfo(){
	  System.out.println("Product-Name: "+name+ " Price: "+price+" quantity: "+quantity);
	}
	
	public int totalCost(){
	  int cost = price*quantity;
	  return cost;
	  
	}
	public boolean inStock(){
	  boolean stock;
	  if(quantity > 0){
	    stock = true;
	  }
	  else{
	    stock = false;
	    }
	  return stock;
	}
}


