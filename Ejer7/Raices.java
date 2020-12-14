/*7) Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:

obtenerRaices(): imprime las 2 posibles soluciones
obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
Solo varia el signo delante de -b
*/
package Ejer7;
public class Raices {
    //Atributos
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return (b*b)-4*a*c;
    }
    public  void obtenerRaices(){
        double suma=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double resta=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        System.out.println("suma:"+suma+" "+" resta:"+resta);
    }
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    public void calcular(){
        if(getDisciminante()){
        }
    }
    /*
    public double getSumaSoluciones(){
        double suma=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        return suma;
    }
    public double getRestaSolucion(){
        double resta=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        return resta;
    }
*/
}
