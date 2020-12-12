
package Ejer15;

public class Contactos {
    private String nombre;
    private double telefono;

    public Contactos(String nombre, double telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contactos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public boolean equals(Object a){
        if(a instanceof Contactos){
            Contactos c=(Contactos)a;
            return this.equals(c);
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }
    
    
}
