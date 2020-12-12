/*14) Nos piden hacer un almacén, vamos a usar programación orientado a objetos.

En un almacén se guardan un conjunto de  bebidas.

Estos productos son bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc). De los productos nos interesa saber su identificador (cada uno tiene uno distinto), cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen (manantial tal sitio o donde sea).

Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio).

En el almacén iremos almacenado estas bebidas por estanterías (que son las columnas de la matriz).

Las operaciones del almacén son las siguientes:

Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
Calcular el precio total de una estantería: dada una estantería (columna) calcular el precio total de esas bebidas.
Agregar producto: agrega un producto en la primera posición libre, si el identificador esta repetido en alguno de las bebidas, no se agregará esa bebida.
Eliminar un producto: dado un ID, eliminar el producto del almacén.
Mostrar información: mostramos para cada bebida toda su información.
Puedes usar un main para probar las funcionalidades (añade productos, calcula precios, muestra información, etc)
 */
package Ejer14;
public class Productos {
    private double cantidad_litros;
    private double precio;
    private String marca;
    private int id;
    
    public Productos(double cantidad_litros, double precio, String marca, int id) {
        this.cantidad_litros = cantidad_litros;
        this.precio = precio;
        this.marca = marca;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getCantidad_litros() {
        return cantidad_litros;
    }

    public void setCantidad_litros(double cantidad_litros) {
        this.cantidad_litros = cantidad_litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "cantidad_litros=" + cantidad_litros + ", precio=" + precio + ", marca=" + marca;
    }
    
    
}
