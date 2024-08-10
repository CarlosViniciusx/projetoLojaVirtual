package entities;

public class Client {
	
	private String name;
	
	// Builders
	
	public Client() {
	}
	
	public Client(String name) {
		this.name = name;
	}
	
	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "Name Client: " + name;
	}

}
