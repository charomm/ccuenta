import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCcuentaMRMM {

	@Test
	void testCreacionMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		assertTrue(cta != null);
	}
	
	@Test
	void testCreacionCompletaMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		assertTrue(cta.getNombre() != null);
		assertTrue(cta.getCuenta() != null);
		assertTrue(cta.getSaldo() != 0);
	}
	
	@Test
	void testIngresoMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		cta.ingresar(1000);
		assertTrue(cta.getSaldo() == 4200);
	}
	
	@Test
	void testIngresoNegativoMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		cta.ingresar(-1000);
		assertTrue(cta.getSaldo() == 2200);
	}	

	@Test
	void testRetiradaCorrectaMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		cta.retirar(1000);
		assertTrue(cta.getSaldo() == 2200);
	}
	@Test
	void testGranRetiradaMRMM() {
		Ccuenta cta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
		cta.retirar(3200);
		assertTrue(cta.getSaldo() == 0);
	}
	
	
}
