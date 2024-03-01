package hashProblema;

import java.util.Objects;

public class Ejemplo {
	private int valor;
	private int item;

	public Ejemplo(int valor, int item) {
		super();
		this.valor = valor;
		this.item = item;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item, valor);
	}

}
