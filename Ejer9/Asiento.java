
package Ejer9;

public class Asiento {
     private int fila;
    private char columna;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.espectador=null;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    public boolean ocupado(){
        //diferente de null: esta acupadop
        return espectador!=null;
    }

    @Override
    public String toString() {
        return " " + fila + " " + columna;
    }

}
