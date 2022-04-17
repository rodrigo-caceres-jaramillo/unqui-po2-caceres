package TP3.ar.edu.unq.po2;
import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> content;
	//Builder
	public Multioperador() {
		this.setcontent(new ArrayList<Integer>());
	}
	//Gets/Sets
	public void setcontent(ArrayList<Integer> content) {
		this.content = content;
	}

	public ArrayList<Integer> getContent() {
		return content;
	}
	//Methods
	public Multioperador add(Integer n) {
		this.getContent().add(n);
		return this;
	}
	
	public Integer addition() {
		int r = 0;
		for (int n : this.getContent()) {
			r += n;
		}
		return r;
	}
	
	public Integer subtraction() {
		int r = 0;
		for (int n: this.getContent()) {
			r -= n;
		}
		return r;
		
	}
	public Integer multiplication() {
		int r = 1;
		for (int n : this.getContent()) {
			r = r * n;
		}
		return r;
	}
}