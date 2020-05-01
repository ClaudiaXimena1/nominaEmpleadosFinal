package co.com.udem.nomina.util;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class PoblarEstructuraTest {
	
	@Test
	public void tamanoHashMapTest() {
		
		int tamanoLista;
		tamanoLista = PoblarEstructura.tamanoHashMap();
		assertNotEquals(0, tamanoLista);
		
	}

}
