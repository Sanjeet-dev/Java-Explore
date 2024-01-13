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


