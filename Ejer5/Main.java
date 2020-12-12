
package Ejer5;

public class Main {
    public static int indiceMayorTemporadas(Serie series []){
        int indiceMayor=0, Tem_mayor=series[0].getN_Temp();
        
        for(int i=1; i<series.length; i++){
        if(series[i].getN_Temp()>Tem_mayor){
            Tem_mayor=series[i].getN_Temp();
            indiceMayor=i;
            }
        }
        return indiceMayor;
    }
      public static int indiceMayorHoras(VideoJuego videojuegos []){
        int indiceMayor=0, Tem_mayor=videojuegos[0].getHoras_Esti();
        
        for(int i=1; i<videojuegos.length; i++){
        if(videojuegos[i].getHoras_Esti()>Tem_mayor){
            Tem_mayor=videojuegos[i].getHoras_Esti();
            indiceMayor=i;
            }
        }
        return indiceMayor;
    }
public static void main(String[]args){
        Serie series[]=new Serie[5];
        VideoJuego videojuegos[]=new VideoJuego[5];
        
        series[0]=new Serie("betty","comedia","getulia",6);
        series[1]=new Serie("umbrulle academy","accion","getulia",2);
        series[2]=new Serie("TWD","drama","getulia",7);
        series[3]=new Serie("Oasis","accion","getulia",8);
        series[4]=new Serie("lucifer","accion","getulia",4);
        
        videojuegos[0]=new VideoJuego("mario bros",7,"animado","local");
        videojuegos[1]=new VideoJuego("Sim",2,"animado","local");
        videojuegos[2]=new VideoJuego("Fortnite",8,"accion","local");
        videojuegos[3]=new VideoJuego("Minecraft",5,"accion","local");
        videojuegos[4]=new VideoJuego("mario bros 2",20,"animado","local");
        
        int Indice_Tem=indiceMayorTemporadas(series);
        System.out.println("La serie con el mayor numero de temporadas es:"+series[Indice_Tem].toString());
        
        int Indice_Series=indiceMayorHoras(videojuegos);
        System.out.println("El video juego con mayor numero de horas es:"+videojuegos[Indice_Series].toString());
        
         //entregar 
       series[0].entregar();
       series[1].entregar();
       videojuegos[0].entregar();
       
       //recorer arrays para ver cuantos entregados hay
        int entregados_S=0, entregados_V=0;
        for(int i=0; i<videojuegos.length; i++){
            if(videojuegos[i].isEntregado()){
                entregados_V++;
                videojuegos[i].devolver();
            }
            if(series[i].isEntregado()){
                entregados_S++;
                series[i].devolver();
            }
        }
        System.out.println("hay "+entregados_V+" video juegos entregados");
        System.out.println("hay "+entregados_S+" series entregadas");
      }
}
