package delegados;

import java.util.Objects;

public class Cosa {
	private String nombre;
	private Float valor;
	
	public Cosa(String nombre, Float valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cosa other = (Cosa) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(valor, other.valor);
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
