package cuentasolucion;

import java.util.Objects;

public class Titular {
	private String nombre;
	private String dni;
	private Direccion direccion;
	public Titular(String nombre, String dni, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(direccion, dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titular other = (Titular) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(dni, other.dni);
	}
	
	
}
