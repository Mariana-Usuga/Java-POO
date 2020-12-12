
package Ejer14;

public class Bebida_Azucarada extends Productos{
    private double porcentajeAzucar;
    private double descuento=0.10;

    public Bebida_Azucarada(double porcentajeAzucar,double cantidad_litros, double precio, String marca, int id) {
        super(cantidad_litros, precio, marca, id);
        this.porcentajeAzucar = porcentajeAzucar;
    }
    

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString()+" porcentajeAzucar=" + porcentajeAzucar + ", descuento=" + descuento + '}';
    }
    
    
    
}
