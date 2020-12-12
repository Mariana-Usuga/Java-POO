/*4) Crearemos una supeclase llamada Electrodomestico con las siguientes características:

Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
Los constructores que se implementaran serán
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con todos los atributos.
Los métodos que implementara serán:
Métodos get de todos los atributos.
comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
LETRA	PRECIO
A	100 €
B	80 €
C	60 €
D	50 €
E	30 €
F	10 €
TAMAÑO	PRECIO
Entre 0 y 19 kg	10 €
Entre 20 y 49 kg	50 €
Entre 50 y 79 kg	80 €
Mayor que 80 kg	100 €Crearemos una subclase llamada Lavadora con las siguientes características:
Su atributo es carga, ademas de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
Método get de carga.
precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. 
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

Crearemos una subclase llamada Television con las siguientes características:
Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
Método get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

Ahora crea una clase ejecutable que realice lo siguiente:
Crea un array de Electrodomesticos de 6 posiciones.
Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
Ahora, recorre este array y ejecuta el método precioFinal().
Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras 
por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television
y Lavadora también son electrodomésticos).
Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
 */
package Ejer4;
public  class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoElectrico;
    private double peso;
    
    private String color_cons="blanco";
    private char consumo_Elec_cons='F';
    private final double precio_base=100;
    private final double peso_cons=5;

    public Electrodomestico() {
    }
    public Electrodomestico(double precioBase, double peso) {
        if(this.precioBase!=100){
            this.precioBase = precio_base;
        }else{
            this.precioBase=precioBase;
        }
        
        if(this.peso<0){
            this.peso=peso_cons;
        }
        else{
        this.peso = peso;
        }
        color_cons="blanco";
        consumo_Elec_cons='F';
    }
    public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
        if(this.precioBase!=100){
            this.precioBase = precio_base;
        }else{
            this.precioBase=precioBase;
        }
        if(this.peso<0 || this.peso>79){
            this.peso=peso_cons;
        }
        else{
            this.peso = peso;
        }
        comprobarConsumoEnergetico(consumoElectrico);
        comprobrarColor(color);
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoElectrico() {
        return consumoElectrico;
    }
    public double getPeso() {
        return peso;
    }
    public void comprobarConsumoEnergetico(char letra){
        if(letra=='a'||letra=='b'||letra=='c'||letra=='d'||
                letra=='e'||letra=='f'){
            this.consumoElectrico=letra;
        }
        else{
            this.consumoElectrico=consumo_Elec_cons;
        }
    }
    public void comprobrarColor(String color){
        if("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color)||
            "azul".equals(color) || "gris".equals(color)){
            this.color=color;
        }
        else{
            this.color=color_cons;
        }
    }
    public double precioFinal(){
        double aumenta=0;
        switch(consumoElectrico){
            case 'a': aumenta+=100;
            break;
            case 'b': aumenta+=80;
            break;
            case 'c': aumenta+=60;
            break;
            case 'd': aumenta+=50;
            break;
            case 'e': aumenta+=30;
            break;
            case 'f': aumenta+=10;
            break;
        }
            if(peso>0 && peso <=19){
            aumenta+=10;
        }
        else if(peso>=20 && peso<=49){
            aumenta+=50;
        }
        else if(peso>=50 && peso<=79){
            aumenta+=80;
        }
        else{
            aumenta+=100;
        }
        return precioBase+aumenta;
    }
}
