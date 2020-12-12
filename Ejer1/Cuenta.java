
package Ejer1;
public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular =titular;
        this.cantidad=0;
    }
    
    public String getTitular() {
        return titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void ingresar(double canti){
        if(canti>0){
            this.cantidad+=canti;
            System.out.println("Dinero ingresado");
        }
        else if(canti<=0){
            System.out.println("error,la cantidad es negativa");
        }
    }
    public void retirar(double cantid){
        if(cantid>this.cantidad){
            System.out.println("error, no tiene el suficiente dinero para retirar");
        }
        else if(cantid<0){
            System.out.println("error, la cantidad ingresada es negativa");
        }
        else{
            this.cantidad-=cantid;
            System.out.println("Dinero retirado");
        }
       }   
    @Override
    public String toString(){
        return "titular:"+this.titular+" cantidad:"+this.cantidad;
    }
    
    public static void main(String[] args) {
        Cuenta titular1=new Cuenta("Sandra",2000);
        
        titular1.ingresar(300);
        titular1.retirar(200);
        titular1.ingresar(5000);
        System.out.println("Dinero disponible: $"+titular1.getCantidad());
    }
}
