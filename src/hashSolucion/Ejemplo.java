package hashSolucion;

import java.util.Objects;

public class Ejemplo {
	private int valor;
	private int item;

	public Ejemplo(int valor, int item) {
		super();
		this.valor = valor;
		this.item = item;
	}
// Solucion: siempre que sobrescribas hascode
//	hay que sobrescribir equals y viceversa

	@Override
	public int hashCode() {
		return Objects.hash(item, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplo other = (Ejemplo) obj;
		return item == other.item && valor == other.valor;
	}
	

}
