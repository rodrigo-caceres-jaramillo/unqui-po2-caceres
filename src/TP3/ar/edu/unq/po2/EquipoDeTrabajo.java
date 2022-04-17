package TP3.ar.edu.unq.po2;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String name;
	private ArrayList<Persona> members;
	//Builder
	public EquipoDeTrabajo(String name) {
		this.setName(name);
		this.members = new ArrayList<Persona>();
	}
	public EquipoDeTrabajo(String name, ArrayList<Persona> members) {
		this.setName(name);
		this.setMembers(members);
	}
	//Gets/Sets
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Persona> getMembers() {
		return this.members;
	}
	public void setMembers(ArrayList<Persona> members) {
		this.members = members;
	}
	//Methods
	public EquipoDeTrabajo addMember(Persona m) {
		this.getMembers().add(m);
		return this;
	}
	public float averageAge () {
		int totalAge = 0;
		for (Persona p : this.getMembers()) {
			totalAge += p.getAge();
			}
		return (totalAge / this.getMembers().size());
	}
}
