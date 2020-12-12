
package Ejer7;

public class Main {
    public static void main(String[]args){
            /*
        Scanner entrada=new Scanner(System.in);
        int a,b,c;
        System.out.print("Ingrese a:");
        a=entrada.nextInt();
        System.out.print("Ingrese b:");
        b=entrada.nextInt();
        System.out.print("Ingrese c:");
        c=entrada.nextInt();
        Raices Ecu1=new Raices(a,b,c);
        //Devuelve el valor de discriminante
        System.out.print("Discriminante:");
        System.out.println(Ecu1.getDiscriminante()); 
        //Dos o una solucion
        if(Ecu1.getDiscriminante()>0){
            System.out.println("La ecuacion tiene dos soluciones: "+Ecu1.getRestaSolucion());
            System.out.println(Ecu1.getSumaSoluciones());
         }
        else if(Ecu1.getDiscriminante()==0){
           System.out.println("La ecuacion tiene una solucion:"+Ecu1.getRestaSolucion());
        }
        else{
            System.out.println("No tiene soluciones");
        }*/
            Raices Ecu1=new Raices(1,2,-8);
            Ecu1.obtenerRaices();
        }
}
