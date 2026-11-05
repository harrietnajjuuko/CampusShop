package shop;

public class Product {
	// private attributes(Encapsulation)
	
	    private String productId;
	    private String productName;
	    private String productCategory;
	    private double unitPrice;
	    private int quantityInStock;

	    // Constructor
	    public Product(String productId, String productName,
	                   String productCategory, double unitPrice,
	                   int quantityInStock) {

	        setProductId(productId);
	        setProductName(productName);
	        setProductCategory(productCategory);
	        setUnitPrice(unitPrice);
	        setQuantityInStock(quantityInStock);
	    }

	    // Getters
	    public String getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public String getProductCategory() {
	        return productCategory;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public int getQuantityInStock() {
	        return quantityInStock;
	    }

	    // Setters with validation
	    public void setProductId(String productId) {
	        if (productId == null || productId.trim().isEmpty()) {
	        throw new IllegalArgumentException("Product ID cannot be empty");
	        }
	        this.productId = productId;
	    }

	    public void setProductName(String productName) {
	        if (productName == null || productName.trim().isEmpty()) {
	            throw new IllegalArgumentException("Product name cannot be empty");
	        }
	        this.productName = productName;
	    }

	    public void setProductCategory(String productCategory) {
	        if (productCategory == null || productCategory.trim().isEmpty()) {
	            throw new IllegalArgumentException("Category cannot be empty");
	        }
	        this.productCategory = productCategory;
	    }

	    public void setUnitPrice(double unitPrice) {
	        if (unitPrice < 0) {
	            throw new IllegalArgumentException("Price cannot be negative");
	        }
	        this.unitPrice = unitPrice;
	    }

	    public void setQuantityInStock(int quantityInStock) {
	        if (quantityInStock < 0) {
	            throw new IllegalArgumentException("Stock cannot be negative");
	        }
	        this.quantityInStock = quantityInStock;
	    }
	}
	
	


