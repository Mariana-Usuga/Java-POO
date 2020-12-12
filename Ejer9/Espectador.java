
package Ejer9;
public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisponible;

    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
    public boolean edadSuficiente(int edadMinima){
        return edad>=edadMinima;
    }
    public boolean dineroSuficiente(double precio){
        return dineroDisponible>=precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible;
    }
    
    
}
