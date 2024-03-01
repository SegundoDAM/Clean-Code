package cuentasolucion;

import java.util.Objects;

public class Cuenta2 {
	private int numeroCuenta;
	private float saldo;
	private Titular titular;

	public Cuenta2(int numeroCuenta, float saldo, Titular titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta, titular);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta2 other = (Cuenta2) obj;
		return numeroCuenta == other.numeroCuenta && Objects.equals(titular, other.titular);
	}

}
