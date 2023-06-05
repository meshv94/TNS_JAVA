package tnsJava;

class Product {
    String name;
    double price;
    int quantity;
    static int totalSold = 0;

    void sell(int quantity){
        this.quantity = this.quantity - quantity;
        totalSold = totalSold + quantity;
    }

    static int getTotalSold(){
        return totalSold;
    }
}

public class ProductExample {

	public static void main(String[] args) {
		
		 Product Phone = new Product();
	        Phone.name = "I-phone";
	        Phone.price = 100;
	        Phone.quantity = 5;

	      Product Laptop = new Product();
	        Laptop.name = "Dell";
	        Laptop.price = 1000;
	        Laptop.quantity = 8;

	        Phone.sell(2);
	        Laptop.sell(3);

	        System.out.println(Product.getTotalSold());
		

	}

}
