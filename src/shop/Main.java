package shop;

public class Main {
	

	    // Method to display product information
	    public static void displayProduct(Product product) {
	    	
	        System.out.println("Product ID: " + product.getProductId());
	        System.out.println("Product Name: " + product.getProductName());
	        System.out.println("Product Category: " + product.getProductCategory());
	        System.out.println("Unit Price: UGX " + product.getUnitPrice());
	        System.out.println("Quantity in Stock: " + product.getQuantityInStock());
	    }

	    public static void main(String[] args) {

	        // QUESTION THREE: Creating five Product objects

	        Product product1 = new Product(
	            "P001", "Exercise Books", "Stationery", 2500, 100);

	        Product product2 = new Product(
	            "P002", "Blue Pens", "Writing Materials", 1000, 200);

	        Product product3 = new Product(
	            "P003", "Printing Paper", "Paper Products", 15000, 50);

	        Product product4 = new Product(
	            "P004", "Flash Disk", "Computer Accessories", 25000, 30);

	        Product product5 = new Product(
	            "P005", "Calculator", "Mathematical Tools", 18000, 25);

	        // Store all products in an array
	        Product[] products = {
	            product1, product2, product3, product4, product5
	        };

	        // QUESTION FOUR (a): Display all products

	        System.out.println("CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM");
	        System.out.println("ALL PRODUCTS BEFORE UPDATES");

	        for (Product product : products) {
	            displayProduct(product);
	        }

	        // QUESTION FOUR (b): Update product price

	        System.out.println("UPDATING PRODUCT INFORMATION");

	        product1.setUnitPrice(3000);

	        // QUESTION FOUR (c): Update stock quantity

	        product4.setQuantityInStock(45);

	        System.out.println("Exercise Books price updated.");
	        System.out.println("Flash Disk stock quantity updated.");

	        // QUESTION FOUR (d): Display updated information

	        System.out.println("PRODUCTS AFTER UPDATES");

	        for (Product product : products) {
	            displayProduct(product);
	        }

	        // QUESTION FOUR (e): Test invalid information

	        System.out.println("TESTING INVALID INFORMATION");

	        try {
	            product2.setUnitPrice(-500);
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("Invalid value rejected: " + e.getMessage());
	        }

	        System.out.println("Blue Pens price remains: UGX "
	                + product2.getUnitPrice());

	        // Demonstrating object independence

	        System.out.println("OBJECT INDEPENDENCE CHECK");

	        System.out.println("Exercise Books price: UGX "
	                + product1.getUnitPrice());

	        System.out.println("Blue Pens price: UGX "
	                + product2.getUnitPrice());
	    }
	}
	




	


