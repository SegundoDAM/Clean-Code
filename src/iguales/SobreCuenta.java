package iguales;

public class SobreCuenta {

	public static void main(String[] args) {
		Cuenta uno=new Cuenta(1,100f,"Salustiano");
		Cuenta dos=new Cuenta(2,1000f,"Federico");
		if(uno!=dos) {
			System.out.println("no son la misma");
		}
		if(!uno.equals(dos))
			System.out.println("no son la misma dos");
		Cuenta tres=new Cuenta(2,1000f,"Federico");
		if(tres!=dos) {
			System.out.println("no son la misma tres");
		}
		if(tres.equals(dos))
			System.out.println("son la misma cuatro");

	}

}
