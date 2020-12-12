
package Ejer4;
public class Lavadora extends Electrodomestico{
    private double carga;
    private final double carga_Defec=5;
    //metodos constructores
    public Lavadora() {
    }
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }
    public Lavadora(double precioBase, String color, char consumoElectrico, 
            double peso,double carga){
        super(precioBase, color,consumoElectrico,peso);
        this.carga=carga;
    }
    public double getCarga() {
        return carga;
    }
    @Override
    public double precioFinal(){
        if(this.carga>30){
            return super.precioFinal()+50;
        }
        return super.precioFinal();
    }
}

