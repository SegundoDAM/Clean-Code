package delegados;

import java.util.ArrayList;

public class Coleccion {
	private ArrayList<Cosa> cosas;

	public Coleccion() {
		super();
		cosas = new ArrayList<>();
	}

	public boolean contains(Object o) {
		return cosas.contains(o);
	}

	public Cosa get(int index) {
		return cosas.get(index);
	}

	public boolean add(Cosa e) {
		return cosas.add(e);
	}

	public boolean equals(Object o) {
		return cosas.equals(o);
	}


	
}
