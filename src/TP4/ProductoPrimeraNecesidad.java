package TP4;

public class ProductoPrimeraNecesidad extends Producto{
	private int discount;
	
	public ProductoPrimeraNecesidad(String name, double price, boolean specialPrice, int discount) {
		super(name, price, specialPrice);
		this.discount = discount;
		// TODO Auto-generated constructor stub
	}

	public double getDiscount() {
		return this.discount;
	}
	
	public double getPrice() {
		double initalPrice = this.price;
		return initalPrice - (this.getDiscount()/100d) * this.price;
	}

}
