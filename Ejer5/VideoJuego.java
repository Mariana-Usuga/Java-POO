
package Ejer5;
public class VideoJuego implements Entregable {
    private String titulo;
    private int horas_Esti;
    private boolean entregado;
    private String genero;
    private String compañia;
            
    private final int horas_Esti_Dec=10;
    private  boolean entregado_De=false;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horas_Esti) {
        this.titulo = titulo;
        this.horas_Esti = horas_Esti;
    }

    public VideoJuego(String titulo, int horas_Esti, String genero, String compañia) {
        this.titulo = titulo;
        this.horas_Esti = horas_Esti;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_Esti() {
        return horas_Esti;
    }

    public void setHoras_Esti(int horas_Esti) {
        this.horas_Esti = horas_Esti;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        entregado_De=true;
    }

    @Override
    public void devolver() {
        entregado_De=false;
    }
    @Override
    public boolean isEntregado() {
       return entregado_De;
    }
    @Override
    public String toString() {
        return titulo + " con:" + horas_Esti + " horas estimadas, "+" genero:"+genero;
    }
}
