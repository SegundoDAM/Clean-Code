package equals.coleccionSolucion;

import java.util.ArrayList;

public class Coleccion {
	private ArrayList<Cosa> cosas;

	public Coleccion() {
		super();
		cosas = new ArrayList<>();
	}

	public boolean contains(Cosa cosa) {
		return cosas.contains(cosa);
	}

	public boolean add(Cosa cosa) {
		if (!contains(cosa))
			return cosas.add(cosa);
		return false;
	}
}
