
package Ejer5;

public class Serie implements Entregable{
     private String titulo;
    private String genero;
    private String creador;
    private int n_Temp;
    
    private final int n_Tem=3;
    private boolean entregado=false;

    public int mayor=1;
    public int menor=-1;
    public int igual=0;
    
    public Serie() {
        }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, int n_Temp) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.n_Temp = n_Temp;
    }

    
    public int getN_Temp() {
        return n_Temp;
    }

    public void setN_Temp(int n_Temp) {
        this.n_Temp = n_Temp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getN_Tem() {
        return n_Tem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    @Override
    public void entregar(){
      entregado=true;
    }

    @Override
    public void devolver(){
        entregado= false;
    }

    @Override
    public boolean isEntregado() {
      return entregado;
    }

    @Override
    public String toString() {
        return titulo + " con:" + n_Tem + " temporadas," +" genero:"+ genero;
    }  
}
