package iguales;
public class Equivalencia {
   public static void main(String[] args) {
     Integer n1 = new Integer(47);
     Integer n2 = new Integer(47);
  
     System.out.println("n1==n2: "+(n1 == n2));
     System.out.println("n1!=n2: "+(n1 != n2));
 
     String s1 = new String("Hola");
     String s2 = new String("Hola");
 
     System.out.println("s1==s2: "+s1 == s2);
     System.out.println("s1!=s2: "+s1 != s2);
   }
}