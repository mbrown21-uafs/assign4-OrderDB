package data;

public class Order {
	private int orderID;
	private String customerName;
	private String product;
	private double totalAmount;
	private String orderDate;

	  // Order ID
	  public void setOrderID(int orderID) {
	        this.orderID = orderID;
	    }
	  public int getOrderID() {
	        return orderID;
	    }

	  // Customer Name
	  public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	  public String getCustomerName() {
	        return customerName;
	    }

	  // Product
	  public void setProduct(String product) {
	        this.product = product;
	    }
	  public String getProduct() {
	        return product;
	    }

	  // Total Amount
	  public void setTotalAmount(double totalAmount) {
	        this.totalAmount = totalAmount;
	    }
	  public double getTotalAmount() {
	        return totalAmount;
	    }

	  // Order Date
	  public void setOrderDate(String orderDate) {
	        this.orderDate = orderDate;
	    }
	  public String getOrderDate() {
	        return orderDate;
	    }

	  public Order() {
		  
	  }
	  
	  public Order(int orderID; String customerName; String product, double totalAmount, String orderDate) {
		  this.setOrderID(orderID);
		  this.setCustomerName(customerName);
		  this.setProduct(product);
		  this.setTotalAmount(totalAmount);
		  this.setOrderDate(orderDate);
	  }
	  
}


