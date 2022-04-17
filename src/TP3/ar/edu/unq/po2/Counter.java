package TP3.ar.edu.unq.po2;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> content;
	//Builder
	public Counter() {
		this.setContent(new ArrayList<Integer>());
	}
	//Gets/Sets
	public void setContent(ArrayList<Integer> c) {
		this.content = c;
	}	
	public ArrayList<Integer> getContent() {
		return content;
	}
	//Metodos
	public Counter add(Integer n) {
		this.getContent().add(n);
		return this;
	}
	public Integer evenOcurrences() {
		int evens = 0;
		for (int n : this.getContent()) {
			if (n%2 == 0) {
				evens = evens + 1;
				}
			}
		return evens;
	}	
	public int oddsOcurrences() {
		int odds = 0;
		for (int n : this.getContent()) {
			if(!(n%2==0)) {
	            odds = odds + 1;
	            }
	        }
		return odds;
	}
	public int cantidadDeMultiplosDe(Integer multiplicador) {
		int multiplos = 0;
		for (int numero : this.getContent()) {
			if(numero% multiplicador==0) {
				multiplos = multiplos + 1;
				}
			}
		return multiplos;
	}
}
