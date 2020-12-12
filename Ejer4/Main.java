package Ejer4;
public class Main {
    public static void main(String[]args){
        Electrodomestico listaElec[];
        listaElec = new Electrodomestico[6];
        
        listaElec[0]=new Lavadora(100,"blanco",'f',5,35);
        listaElec[1]=new Lavadora(100,"gris",'h',7,20);
        listaElec[2]=new Lavadora(100,"negro",'h',5,20);
        listaElec[3]=new Televisor(20,false,100,"azul",'b',5);
        listaElec[4]=new Televisor(20,true,100,"blanco",'e',5);
        listaElec[5]=new Televisor(20,false,100,"azul",'b',5);
        
        double precioLava=listaElec[0].precioFinal()+listaElec[1].precioFinal()+listaElec[2].precioFinal();
        System.out.println("Precio de todas las lavadoras es:"+precioLava);
        
        double precioTv=listaElec[3].precioFinal()+listaElec[4].precioFinal()
        +listaElec[5].precioFinal();
        System.out.println("Precio de todos los televiores:"+precioTv);
        System.out.println(" ");
      
        int total=0;
        for (Electrodomestico listaElec1 : listaElec) {
            total += listaElec1.precioFinal();
        }
        System.out.println("El precio total es:"+total);
        
    }
}

