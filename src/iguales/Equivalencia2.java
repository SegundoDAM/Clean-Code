package iguales;
public class Equivalencia2 {
   public static void main(String[] args) {
     Integer n1 = new Integer(47);
     Integer n2 = new Integer(47);
  
     System.out.println("n1.equals(n2): "+n1.equals(n2));
 
     String s1 = new String("Hola");
     String s2 = new String("Hola");
 
     System.out.println("s1.equals(s2): "+s1.equals(s2));
   }
}