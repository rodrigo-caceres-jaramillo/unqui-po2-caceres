package TP4;

import java.util.ArrayList;

public class Supermercado {
	private String name;
	private String adress;
	private ArrayList<Producto> products;
	//Builder
	public Supermercado(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
		this.products = new ArrayList<Producto>();
	}
	//Gets/Sets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public ArrayList<Producto> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Producto> products) {
		this.products = products;
	}
	
	//Methods
	public Integer getProductsSize() {
		return this.getProducts().size();
	}
	public Supermercado addProduct(Producto p) {
		this.getProducts().add(p);
		return this;
	}
	
	public Double getTotalPrice() {
		double total = 0;
		for(Producto p : this.getProducts()) {
			total += p.getPrice();
		}
		return total;
	}
}