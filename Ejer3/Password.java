/*3) Haz una clase llamada Password que siga las siguientes condiciones:

Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
generarPassword():  genera la contraseña del objeto con la longitud que tenga.
Método get para contraseña y longitud.
Método set para longitud.
Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2
 */
package Ejer3;
public class Password {
    private int longitud;
    private String contraseña;
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public Password() {
       int aleatorio=(int)(Math.random()*8);
       this.longitud = aleatorio;
       generarPassword(longitud);
    }
    
    private void generarPassword(int longitud){
        final int divisor=23;
        final int divisor2=22;
        //generar numero de 8 digitos
        //int numDNI=((int)Math.floor(Math.random()*(1000000-1000000)+1000000));
        int numDNI=((int)Math.floor(Math.random()*10000000));
        int letra=((int)Math.floor(Math.random()*50));
        int letra2=((int)Math.floor(Math.random()*50));
        //calculamos la letra del DNI
        char letraDNI=generarLetraDNI(letra);
        char letraDNI2=generarLetraDNI(letra2);
        char letraDNI3=generarLetraDNI(letra2);
        char letraDNI4=generarLetraDNI(letra2);
        char letraDNI5=generarLetraDNI(letra2);
        //pasar de Dni a string
        this.contraseña=Integer.toString(numDNI)+letraDNI+letraDNI2+letraDNI3+letraDNI4;
    }
    private char generarLetraDNI(int index){
        char letras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
            'Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x',
            'y','z'};
        return letras[index];
    }
}
