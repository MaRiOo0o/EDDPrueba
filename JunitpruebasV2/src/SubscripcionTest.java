import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	final void testPrecioPorMes() {
		double esperado=100;
		Subscripcion s = new Subscripcion(200,2) ;
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado,0) ;
	}
	@Test
	final void testPrecioPorMes2() {
		double esperado=67.66666666666667;
		Subscripcion s = new Subscripcion(200,3) ;
		double resultado= s.precioPorMes();
		assertEquals(esperado, resultado, 0) ;
	}
}
