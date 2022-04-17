package TP3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP3.ar.edu.unq.po2.EquipoDeTrabajo;
import TP3.ar.edu.unq.po2.Persona;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo1;
	private Persona juan;
	private Persona rodrigo;
	private Persona matias;
	@BeforeEach
	public void setUp() throws Exception {
		equipo1 = new EquipoDeTrabajo("ejemplo");
		juan = new Persona("Juan", LocalDate.parse("1990-08-20"));
		rodrigo = new Persona("Pepe", LocalDate.parse("2000-05-14"));
	   	matias = new Persona("Mati", LocalDate.parse("1999-10-12"));
	   	equipo1.addMember(juan).addMember(rodrigo).addMember(matias);
	}
	@Test
	 public void testPromedioDeEdad() {
		float edadPromedio = equipo1.averageAge(); 
		assertEquals(25,edadPromedio);
	 }
}
