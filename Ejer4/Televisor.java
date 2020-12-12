
package Ejer4;
public class Televisor extends Electrodomestico {
    private double resolucion;
    private boolean sincronizacion;
    private final double resolucion_De=20;
    private final boolean sincronizacion_De=false;
    //metodos
    public Televisor() {
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }
    public Televisor(double resolucion, boolean sincronizacion, double precioBase,
            String color, char consumoElectrico, double peso) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sincronizacion = sincronizacion;
    }
    public double getResolucion() {
        return resolucion;
    }
    public boolean isSincronizacion() {
        return sincronizacion;
    }

    public double getResolucion_De() {
        return resolucion_De;
    }

    public boolean isSincronizacion_De() {
        return sincronizacion_De;
    }
    
    @Override
    public double precioFinal(){
        if(resolucion>40 && sincronizacion==true){
            return (super.getPrecioBase()+50)*0.3;
        }
        else if(resolucion>40){
            return super.precioFinal()*0.3;
        }
        return super.precioFinal();
    }
}
