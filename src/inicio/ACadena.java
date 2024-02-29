package inicio;

public class ACadena {
	public static void main(String[] args) {
		char[] charArray;
		String cadena = new String("Hola");
		String cadenaDos = new String("Hola");
		Integer entero = new Integer(16);
		String cadenaTres=cadena;
		if(cadena==cadenaDos) 
			System.out.println("Son el mismo");
		//con == lo que preguntamos es si son el mismo
		if(cadena==cadenaTres) 
			System.out.println("Son el mismo tres");
		if(cadena.equals(cadenaDos))
			System.out.println("son iguales dos");
		System.out.println();
		
	}
}
