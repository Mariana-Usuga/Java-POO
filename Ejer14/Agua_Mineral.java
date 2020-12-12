
package Ejer14;
public class Agua_Mineral extends Productos{
     private String origen;

    public Agua_Mineral(String origen, double cantidad_litros, double precio, String marca, int id) {
        super(cantidad_litros, precio, marca, id);
        this.origen = origen;
    }

    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + " origen=" + origen + '}';
    }
    
}
