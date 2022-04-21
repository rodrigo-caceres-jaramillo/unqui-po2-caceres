package TP4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getName());
		assertEquals(new Double(18.9), arroz.getPrice());
		assertTrue(arroz.isSpecialPrice());
		
		assertEquals("Vino", vino.getName());
		assertEquals(new Double(55), vino.getPrice());
		assertFalse(vino.isSpecialPrice());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.increasePrice(1.5);
		assertEquals(new Double(20.4), arroz.getPrice());
	}
}
