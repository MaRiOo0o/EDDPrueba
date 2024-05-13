import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	@Test
	final void testSuma() {
		int esperado=4;
		int resultado=OperadorAritmetico.suma(2,2);
		assertEquals(esperado,resultado);
	}
	@Test
	final void testSuma5() {
		int esperado=-3;
		int resultado=OperadorAritmetico.suma(2,-5);
		assertEquals(esperado,resultado);
	}
	@Test
	final void testSuma2() {
		int esperado=-10;
		int resultado=OperadorAritmetico.suma(-5,-5);
		assertEquals(esperado,resultado);
	}
	@Test
	final void testdivision(){
		int esperado=1;
		int resultado;
		try {
			resultado = OperadorAritmetico.division(5,5);
			assertEquals(esperado,resultado);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
