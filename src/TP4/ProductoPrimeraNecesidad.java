package TP4;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String name, double price, boolean specialPrice) {
		super(name, price, specialPrice);
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return (this.price * 0.9);
	}

}
