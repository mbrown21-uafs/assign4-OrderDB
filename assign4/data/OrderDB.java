package data;

import java.io.File;
import java.util.Scanner;


public class OrderDB {
	
	private Order[] orders;
	
	public void loadOrders(String fileName){
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		
		int index;
		
		orders = new Order[50];
		
		input.nextLine();
		
		for(index = 0; index < order.length; index++) {
			String line = input.nextLine();
			String[] parts = line.split(",");
			
			Order order = new Order();
			
			order.setOrderID(Integer.parseInt(parts[0]));
			order.setCustomerName(parts[1]));
			order.setProduct(parts[2]));
			order.setTotalAmount(Double.parseDouble(parts[3]));
			order.setOrderDate(parts[4]));
			
			order[index] = order;
		}
		
		
	}
	
	public void showOrders() {
		
		System.out.println("Order ID Product                                 Total Amt");
		System.out.println("-------- -------                                 ---------");
		
		for(index = 0; index < orders.length; index++) {
			
				System.out.printf("%-8d %-32s %10.2f%n",
						orders[index].getOrderID();
						orders[index].getProduct();
						orders[index].getTotalAmount());
		}
	}
}
