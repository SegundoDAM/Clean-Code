package cuentasolucion;

import java.util.Objects;

public class Direccion {
	private String localidad;
	private String calle;
	private int numero;
	public Direccion(String localidad, String calle, int numero) {
		super();
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
	}
	@Override
	public int hashCode() {
		return Objects.hash(calle, localidad, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(localidad, other.localidad)
				&& numero == other.numero;
	}
	
}
