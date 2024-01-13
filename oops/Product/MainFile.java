class MainFile{
 public static void main(String[] args){
 	Product p1 = new Product("smartWatch",1255, 5);
 	p1.productInfo();
	p1.totalCost();
	System.out.println("Availability of product in Stock: "+p1.inStock());

	Product p2 = new Product("Earbuds", 4000, 0);
	p2.productInfo();
	System.out.println("Availability of product in Stock: "+p2.inStock());
	p2.totalCost();

	

 }
}
