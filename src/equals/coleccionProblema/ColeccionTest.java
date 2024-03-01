package equals.coleccionProblema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColeccionTest {

	@Test
	void test() {
		Coleccion coleccion=new Coleccion();
		//si el elemento no existe debe poder agregarse
		assertTrue(coleccion.add(new Cosa("uno", 1f)));
		//si existe, no, si has hecho bien equals
		assertFalse(coleccion.add(new Cosa("uno", 1f)));
	}

}
