/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer9;

/**
 *
 * @author Mariana
 */
public class Pelicula {
     private String titulo;
    private int duracion;
    private int edadMinima=18;
    private String director;

    public Pelicula(String titulo, int duracion, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima =18;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public boolean tieneEdad(Espectador a){
        return a.edadSuficiente(edadMinima);
    }

    @Override
    public String toString() {
        return titulo + " tiene una duracion de:" + duracion + " para mayores de edad"+" con el director:" + director + '}';
    }
    
    
    
}
