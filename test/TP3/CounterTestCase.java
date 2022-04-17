package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP3.ar.edu.unq.po2.Counter;

class CounterTestCase {
	private Counter counter; 
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		counter.add(3).add(10).add(17).add(2).add(5).add(15);
	}
	@Test
	public void testEvens() {
		int evenOcurrences = counter.evenOcurrences();
		assertEquals(evenOcurrences, 2);
	}
	public void testOdds() {
		int oddsOcurrences = counter.oddsOcurrences();
		assertEquals(oddsOcurrences, 2);
	}
	@Test
    public void testMultiplos() {
    	int cantidadDeMultiplosDe2 = counter.cantidadDeMultiplosDe(2);
    	int cantidadDeMultiplosDe5 = counter.cantidadDeMultiplosDe(5);
    	assertEquals(cantidadDeMultiplosDe2, 2);
    	assertEquals(cantidadDeMultiplosDe5, 3);
    }
}
