package TP4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 10d, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(8.0d, leche.getPrice());
	}
}
