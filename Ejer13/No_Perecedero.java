/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer13;
public class No_Perecedero extends Productos implements PrecioProductos {
    private String tipo;

    public No_Perecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 
    @Override
    public void calcular(int numProductos) {
        super.calcular(numProductos);
    }

    @Override
    public String toString() {
        return super.toString()+"No_Perecedero{" + "tipo=" + tipo + '}';
    }
    
    
}
