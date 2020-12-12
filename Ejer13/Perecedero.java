
 
package Ejer13;
public class Perecedero extends Productos implements PrecioProductos {
    private int diasCaducar;

    public Perecedero(int diasCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }
    
    @Override
    public void calcular(int nProductos) {
        double precioFinal=0;
  
        switch (diasCaducar) {
            case 1:
                precioFinal=(super.getPrecio()*nProductos)*0.70;//100-0.30=0.70
                super.setPrecio(precioFinal);
                break;
            case 2:
                precioFinal=(super.getPrecio()*nProductos)*0.60;
                super.setPrecio(precioFinal);
                break;
            case 3:
                precioFinal=(super.getPrecio()*nProductos)*0.50;
                super.setPrecio(precioFinal);
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return super.toString()+" dias:"+this.diasCaducar;
    }
    
    
    
   
    
    
    
}

