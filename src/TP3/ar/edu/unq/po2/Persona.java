package TP3.ar.edu.unq.po2;

import java.time.LocalDate;

public class Persona {
	private String name;
	private LocalDate birthday;
	//Builder
	public Persona(String name, LocalDate birthday) {
		this.setName(name);
		this.setBirthday(birthday);
	}
	//Gets/Sets
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return this.birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		LocalDate today = LocalDate.now();
		int age = today.getYear()-this.getBirthday().getYear();
		return age;
	}
	//Methods
	public boolean isYoungerThan(Persona p) {
		return( this.getAge() < p.getAge() );
	}

}
