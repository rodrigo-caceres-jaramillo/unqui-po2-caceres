package TP4;

public class Producto {
	private String name;
	public double price;
	private boolean specialPrice;
	//Builder
	public Producto(String name, double price) {
		this.name = name;
		this.price = price;
		this.specialPrice = false;
	}
	public Producto(String name, double price, boolean specialPrice) {
		this.name = name;
		this.price = price;
		this.specialPrice = specialPrice;
	}
	
	//Gets/Sets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(boolean specialPrice) {
		this.specialPrice = specialPrice;
	}
	//Methods
	public void increasePrice(double price) {
		this.setPrice(this.getPrice() + price);
	}
}
