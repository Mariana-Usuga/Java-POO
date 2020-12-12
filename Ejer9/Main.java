
package Ejer9;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
     
       Cine c1=new Cine();
       c1.mostrarAsientos();
       
       Espectador especta[]=new Espectador[4];
        especta[0]=new Espectador("mari",19,5000);
        especta[1]=new Espectador("luis",20,6000);
        especta[2]=new Espectador("will",20,2000);
        especta[3]=new Espectador("sara",24,2000);
        Pelicula p=new Pelicula("matilda",60,"sandra");
       
        System.out.println("Escoja puestos disponibles");
    }
       
}
