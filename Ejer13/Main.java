
package Ejer13;

public class Main {
     public static void main(String[]args){
        Productos lista[]=new Productos[5];
        lista[0]=new Perecedero(1,"fanta",200);//140
        lista[1]=new Perecedero(2,"coca",200);//120
        lista[2]=new Perecedero(3,"bigcola",200);//100
        lista[3]=new No_Perecedero("manantial","fanta",200);
        lista[4]=new No_Perecedero("finca","fanta",200);
        
        lista[0].calcular(2);
        lista[1].calcular(1);
        lista[2].calcular(1);
        lista[3].calcular(1);
        lista[4].calcular(1);
        //precio un productos
        System.out.println(lista[0].toString());
        //todos los productos
        double suma=lista[0].getPrecio();
        System.out.println(suma);
        
        
    }
    
}
