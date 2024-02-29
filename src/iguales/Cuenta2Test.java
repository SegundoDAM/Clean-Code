package iguales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Cuenta2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Direccion direccion=new Direccion("Madrid","Petunia",1);
		Direccion direccionDos=new Direccion("Madrid","Petunia",1);
		Titular titularUno= new Titular("Anselmo","1",direccion);
		Titular titularDos= new Titular("Anselmo","1",direccionDos);
		//ambas cuenta2 que se crean con estos datos deben ser equals
	}

}
