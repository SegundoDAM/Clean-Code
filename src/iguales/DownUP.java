package iguales;
class Padre{}
class Hijo extends Padre{
	public void metodohijo() {}
}
class Sobrino{
	public void saluda() {}
}

public class DownUP {
	public static void main(String[] args) {
	//en una herencia
	Padre padre;
	Hijo hijo=new Hijo();
	Sobrino sobrino=new Sobrino();
	//up casting convertsion hacia arriba (padre)
	padre=(Padre) hijo;
	hijo.metodohijo();
//	padre.metodohijo();
	//hay un control porque en el contexto 
	//java sabe que sobrino no hereda de padre
//	padre= (Padre)sobrino;
	metodo(padre,sobrino);
	}
	
	public static void metodo(Padre padre,Object object) {
		//down casting
//		padre=(Padre) object;
//		object.saluda();
		Sobrino sob=(Sobrino) object;
		sob.saluda();
	}
}
