package iguales;

import java.util.Objects;

public class Cuenta {
	private int numeroCuenta;
	private float saldo;
	private String titular;
	
	public Cuenta(int numeroCuenta, float saldo, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	

	private int getNumeroCuenta() {
		return numeroCuenta;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return numeroCuenta == other.numeroCuenta && Objects.equals(titular, other.titular);
	}


	private void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	private float getSaldo() {
		return saldo;
	}

	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	private String getTitular() {
		return titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}
	
}
