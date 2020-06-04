package javaEightExamples;

public class Product {
	
	//defining product name and its price
	//variable type
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	
	//converting to string
	public String toString() {
		final StringBuilder sb = new StringBuilder("Product{");
		sb.append(" name='").append(name);
		sb.append("' price= ").append(price).append('\'');
		sb.append('}');
		
		return sb.toString();
	}

}
