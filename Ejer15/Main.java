
package Ejer15;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        int opcion;
        
        
        Contactos c1=new Contactos("mariana",311533421);
        
        Agenda a=new Agenda();
        
        do{
            System.out.println("Menu: \n 1.Añadir contacto \n "
                                 + "2.Ver lista\n 3.Buscar contacto\n 4.Eliminar contacto\n 5.lista \n 6.salir");
            opcion=entrada.nextInt();
            switch(opcion){
               case 1:a.añadirContacto(c1);
               break;
               case 2:a.listaContactos();
               break;
               case 3:a.buscarContacto("luisa");
               break;
               case 4:a.eliminarContacto("sa5ra");
               break;
               case 5:a.listaContactos();
           }
         
        }while(opcion!=6);
        
       
        
    }
    
}
