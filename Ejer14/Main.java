/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer14;

/**
 *
 * @author Mariana
 */
public class Main {
    public static void main(String[]args){
        
        Productos bebida1=new Productos(5,2000,"fanta",345);
        Productos bebida2=new Productos(5,4000,"cocacola",347);
        Productos bebida3=new Productos(5,5000,"cuatro",389);
        Productos bebida5=new Productos(5,8000,"cuatro",309);
        //0.10*4000=400- 4000-400=3600
        Productos bebida4=new Bebida_Azucarada(3.5,5,4000-(4000*0.10),"bicola",567);//con descuento del 10%
        Productos bebida6=new Productos(5,1000,"cuatro",309);
    
        Almacen a=new Almacen();
        a.almacenarBebidas(bebida1);
        a.almacenarBebidas(bebida2);
        a.almacenarBebidas(bebida3);
        a.almacenarBebidas(bebida5);
        a.almacenarBebidas(bebida6);
        a.mostrarProductos();
        
        a.calcularPrecioTodas();
        
        System.out.println("precio total de la marca es:"+a.precioDeUnaMarca("cocacola"));
        System.out.println("precio de una columna:"+a.precioDeUnaColumna());
        
        System.out.println(bebida1+"\n"+bebida2+"\n"+bebida3+"\n"+bebida4);
        
        a.eliminarBebida(100);
         a.mostrarProductos();
       
        
        
    }
}
