package equals.parcial;

import java.util.ArrayList;
import java.util.Objects;

public class Elemento {
	private String nombre;
	private Float valor;
	private ArrayList<Integer> items;
	
	public Elemento(String nombre, Float valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.items = new ArrayList<>();
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

	public ArrayList<Integer> getItems() {
		return items;
	}

	public void setItems(ArrayList<Integer> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(items, nombre, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return Objects.equals(items, other.items) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(valor, other.valor);
	}
	
	
}
