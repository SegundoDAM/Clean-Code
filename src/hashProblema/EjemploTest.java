package hashProblema;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjemploTest {

	@Test
	void test() {
		Ejemplo ejemploUno=new Ejemplo(1, 1);
		Ejemplo ejemploDos=new Ejemplo(1, 1);
		Ejemplo ejemploTres=new Ejemplo(1,2);
		assertTrue(ejemploUno.hashCode()==ejemploDos.hashCode());
		assertFalse(ejemploUno.hashCode()==ejemploTres.hashCode());
		ejemploUno=new Ejemplo(1, 31);
		ejemploDos=new Ejemplo(32, 25);
		System.out.println("ejemplo1 "+ejemploUno.hashCode());
		System.out.println("ejemplo2 "+ejemploDos.hashCode());
		assertFalse(ejemploUno.hashCode()==ejemploDos.hashCode());
		ejemploUno=new Ejemplo(1, 31);
		ejemploDos=new Ejemplo(32, 30);
		System.out.println("ejemplo1 "+ejemploUno.hashCode());
		System.out.println("ejemplo2 "+ejemploDos.hashCode());
		assertFalse(ejemploUno.hashCode()==ejemploDos.hashCode());
		//las bandas del hash
		HashMap hashmap;
		HashSet hashSet;
		
	}
}
