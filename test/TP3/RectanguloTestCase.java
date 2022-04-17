package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP3.ar.edu.unq.po2.Point;
import TP3.ar.edu.unq.po2.Rectangulo;

class RectanguloTestCase {
	private Rectangulo rectangulo1;
	private Rectangulo rectangulo2;
	private Point puntoDeInicio;
	
	@BeforeEach
	public void setUp() throws Exception {
		puntoDeInicio = new Point();
		rectangulo1 = new Rectangulo(puntoDeInicio, 100, 200);
		rectangulo2 = new Rectangulo(puntoDeInicio, 200, 100);	
	}
	@Test
	public void testCreacion() {
		Point puntoDeInicion = rectangulo1.getStartPoint();
		int alto = rectangulo1.getHeigth(); 
		int largo = rectangulo1.getLength();
		assertEquals(puntoDeInicion, this.puntoDeInicio);
		assertEquals(alto, 100);
		assertEquals(largo, 200);
	}
	@Test
	public void testArea() {
		float area = rectangulo1.area();
		assertEquals(area, 20000);
	}
	@Test
	public void testDeVertical() {
		assertEquals(rectangulo1.isVertical(), false);
		assertEquals(rectangulo2.isVertical(), true);
	}
	@Test
	public void testDeHorizontal() {
		assertEquals(rectangulo1.isHorizontal(), true);
		assertEquals(rectangulo2.isHorizontal(), false);
	}
}
