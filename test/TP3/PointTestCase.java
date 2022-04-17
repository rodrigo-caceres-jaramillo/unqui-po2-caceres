package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP3.ar.edu.unq.po2.Point;

class PointTestCase {
	private Point punto1;
	private Point punto2;
	@BeforeEach
	public void setUp() throws Exception {
		punto1 = new Point();
		punto2 = new Point(15,15);	
	}
	@Test
	public void testCreacion() {
		float valorX = punto1.getX();
		float valorY = punto1.getY();
		assertEquals(valorX, 0);
		assertEquals(valorY, 0);
	}
	@Test
	public void testCreacion2() {
		float valorX = punto2.getX();
		float valorY = punto2.getY();
		assertEquals(valorX, 15);
		assertEquals(valorY, 15);
	}
	@Test
	public void testMover() {
		punto2.moveTo(20, 20);
		float valorX = punto2.getX();
		float valorY = punto2.getY();
		assertEquals(valorX, 20);
		assertEquals(valorY, 20);
	}
	@Test
	public void sumarOtroPunto() {
		Point nuevoPunto = punto1.addPoint(punto2);
		float valorX = nuevoPunto.getX();
		float valorY = nuevoPunto.getY();
		assertEquals(valorX, 15);
		assertEquals(valorY, 15);
	}
}
