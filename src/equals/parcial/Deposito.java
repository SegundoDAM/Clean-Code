package equals.parcial;

import java.util.ArrayList;
import java.util.Objects;

public class Deposito {
	private Long referencia;
	private String titular;
	private ArrayList<Movimiento> movimientos;
	@Override
	public int hashCode() {
		return Objects.hash(referencia, titular);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deposito other = (Deposito) obj;
		return Objects.equals(referencia, other.referencia) && Objects.equals(titular, other.titular);
	}
	
}
