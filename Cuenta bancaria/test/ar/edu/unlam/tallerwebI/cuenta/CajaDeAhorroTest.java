package ar.edu.unlam.tallerwebI.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void test() {
		CajaDeAhorro miCajaDeAhorro=new CajaDeAhorro();
		
		double miSueldo=miCajaDeAhorro.operacionDepositar(-100);
		assertEquals("no permite deposito negativo", 0, miSueldo, 1e-6);
		
		miSueldo=miCajaDeAhorro.operacionExtraer(150);
		assertEquals("no permite saldo inferior a 0", 0, miSueldo, 1e-6);
	
		assertNotNull("saldo con valor no nulo", miCajaDeAhorro);
		
	}

}
