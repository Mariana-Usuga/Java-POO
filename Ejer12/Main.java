/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer12;

/**
 *
 * @author Mariana
 */
public class Main {
    public static void main(String[]args){
        
        //objeto de la clase Repartidor
        Repartidor re1=new Repartidor("zona 3","mari",15,600);
        re1.plus();
        System.out.println(re1.toString());
    
        System.out.println(" ");
        
        //objeto de la clase Comercial
        Comercial c1=new Comercial(300,"luis",34,400);
        c1.plus();
        System.out.println(c1.toString());
        }
    
}
