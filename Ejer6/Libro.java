/*6) Crear una clase Libro que contenga los siguientes atributos:
– ISBN
– Titulo
– Autor
– Número de páginas
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() 
para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.*/
package Ejer6;
public class Libro {
    private int ISBN;
    private String titulo;
    private String Autor;
    private int numeroPags;

    public Libro(int ISBN, String titulo, String Autor, int numeroPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPags = numeroPags;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    @Override
    public String toString() {
        return "El libro con su ISBN:"+ISBN+ " creado por el autor:"+Autor+ " tiene:"+numeroPags+" paginas";
    }
    
}
