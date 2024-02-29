package iguales;

import java.util.Objects;

class Value {
   int i;

@Override
public boolean equals(Object obj) {
	//clausulas de guarda
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Value other = (Value) obj;
	return i == other.i;
}
}
  
public class Equivalencia3 {
   public static void main(String[] args) {
      Value v1 = new Value();
      Value v2 = new Value();
  
      v1.i = v2.i = 100;
      System.out.println("v1.i=v2.i=100");
      System.out.println("v1.equals(v2): "+v1.equals(v2));
   }
}