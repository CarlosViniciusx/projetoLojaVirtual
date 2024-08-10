package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Client client;
	private List<Product> cart = new ArrayList<>();
	
	// Builders
	
	public Cart() {
	}
	
	public Cart(Client client) {
		this.client = client;
	}
	
	// Getters and Setters
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Product> getCart() {
		return cart;
	}

	public void addItemInCart(Product product) {
		cart.add(product);
	}
	
	public void removeItemInCart(Product product) {
		cart.remove(product);
	}
	
	public double totalInCart() {	
		double value = 0.0;
		
		for(Product product: cart) {
			value += product.getPrice();
		}
		
		return value;
	};
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(client + "\n");
		for (Product product : cart) {
            sb.append(product + "\n");
        };
		sb.append("Total : $" + totalInCart());
		
		return sb.toString();
	}
	
	

}
