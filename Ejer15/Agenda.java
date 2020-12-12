/*15) Nos piden realizar una agenda telefónica de contactos.

Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es igual a otro cuando sus nombres son iguales.
Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)

Los métodos de la agenda serán los siguientes:
aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más a la agenda se indicara por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
existeContacto(Conctacto c): indica si el contacto pasado existe o no.
listarContactos(): Lista toda la agenda
buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
agendaLlena(): indica si la agenda está llena.
huecosLibres(): indica cuantos contactos más podemos meter.
Crea un menú con opciones por consola para probar todas estas funcionalidades.
 */
package Ejer15;

public final class Agenda {
    private final Contactos[] agenda;
    
    public Agenda(){
        agenda=new Contactos[10];
        ContactosExistentes();
    }
    public void ContactosExistentes(){
       agenda[0]=new Contactos("mari",311533421);
       agenda[1]= new Contactos("luisa",31953323);
       agenda[2]= new Contactos("will",312533434);
       agenda[3]= new Contactos("sara",313533467);
        
    }
    public void añadirContacto(Contactos a){
        boolean vacio=true;
        for(int i=0; i<10 && vacio==true; i++){
            if(agenda[i]==null){
                agenda[i]=a;
                vacio=false;
                }
            }
         if(vacio==false){
             System.out.println("contacto guardado");
}
         else{
             System.out.println("agenda llena");
         }
    }
    public void contactoExistente(Contactos a){
        boolean existe=false;
        for(int i=0; i<10; i++){
        if(agenda[i].getNombre().equals(a)){
            existe=true;
           }
        }
        if(existe==true){
            System.out.println("contacto ya existe");
        }
        else{
            System.out.println("contacto no existe");
        }
    }
    public void listaContactos(){
        for(int i=0; i<agenda.length; i++){
            System.out.println("contacto"+(i+1)+":"+agenda[i]+" ");
    }
    }
    public boolean buscarContacto(String nombre){
        boolean esta=false;
        for(int i=0; i<10; i++){
            if(agenda[i].getNombre().equals(nombre)){
                System.out.println("el numero es:"+agenda[i].getTelefono());
                return esta=true;
                
                }
        }
        System.out.println("contacto no esta en la agenda");
        return false;
    }
    
    public void eliminarContacto(String a){
        boolean eliminado=false;
        for(int i=0; i<10; i++){
            if(agenda[i].getNombre().equals(a)){
                agenda[i]=null;
                eliminado=true;
                break;
            }
        }
        if(eliminado==true){
            System.out.println("contacto eliminado");
        }
        else{
            System.out.println("contacto no existe en la agenda");
        }
    }
    public void agendaLlena(){
        int contador=0;
        for(int i=0; i<10; i++){
            if(agenda[i]!=null){
                contador++;
            } 
        }
        if(contador==10){
            System.out.println("agenda llena");
        }
        else{
            System.out.println("Hay"+contador+"  usados. Aun hay espacio. Quedan"+(10-contador)+"contactos" );
        }
    
    }

    
}
