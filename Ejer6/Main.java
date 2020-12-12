
package Ejer6;
public class Main {
     public static void main(String[]args){
        Libro ob1=new Libro(123,"hola","mari",100);
        Libro ob2=new Libro(456,"como estas","will",80);
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        //Cambiar numero de paginas
 if (ob1.getNumeroPags()>ob2.getNumeroPags()){
     System.out.println("Tiene mas paginas el primer libro");
 }
 else{
     System.out.println("Tiene mas paginas el segundo libro");
 }
        
    }
}
