package main;

import java.util.Scanner;

import entities.Cart;
import entities.Client;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome the Carlos's online store!");
		
		System.out.print("Name of Client: ");
		String name = sc.nextLine();
		
		Client client = new Client(name);
		Cart cart = new Cart(client);
		
		int choice = 0;
		
		do {
			System.out.println("-------------------------");
			System.out.println("1 - Product");
			System.out.println("2 - Client Data");
			System.out.println("3 - Total");
			System.out.println("4 - Finish");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.println("-------------------------");
					System.out.println("1 - Toy Car,  Price: $50.00");
					System.out.println("2 - Bicycle,  Price: $600.00");
					System.out.println("3 - Book,     Price: $75.00");
					int product = sc.nextInt();
					switch(product) {
						case 1:
							cart.addItemInCart(new Product("Toy Car", 50.00));
							break;
						case 2: 
							cart.addItemInCart(new Product("Bicycle", 600.00));
							break;
						case 3: 
							cart.addItemInCart(new Product("Book", 75.00));
							break;
						default:
							System.out.println("Error");
							break;
					}
					
					break;
					
				case 2: 
					System.out.println("-------------------------");
					System.out.println(client);		
					break;
					
				case 3:
					System.out.println("-------------------------");
					System.out.println("Total: $" + cart.totalInCart());
					
			}
			
		} while(choice != 4);
		
		System.out.println(cart);	
		
		sc.close();
	}

}
