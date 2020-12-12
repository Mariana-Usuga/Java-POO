
package Ejer14;

public class Almacen {
     
    private Productos[][] estanteria;
   
    public Almacen(){
        estanteria=new Productos[2][2];
    }
    public void almacenarBebidas(Productos a){
        boolean lleno=false;
        for(int i=0; i<2 && !lleno; i++){
            for(int j=0; j<2 && !lleno; j++){
                if(estanteria[i][j]==null){
                estanteria[i][j]=a;
                lleno=true;
            }
            }
        }
        if(lleno==true){
            System.out.println("bebida ingresada");
        }
        else{
            System.out.println("no espacio");
        }
    }
    public void mostrarProductos(){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(estanteria[i][j]);
            }
            System.out.println("");
            }
    }
    
    public void calcularPrecioTodas(){
        double precioTotal=0;
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                precioTotal+=estanteria[i][j].getPrecio();
            }
        }
        System.out.println("el precio total de las bebidas es:"+precioTotal);
    }
    
    public double precioDeUnaMarca(String marca){
        double precioMarca=0;
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                if(estanteria[i][j].getMarca().equals(marca)){
                    precioMarca+=estanteria[i][j].getPrecio();
                }
            }
        }
        return precioMarca;
        }
    
    public double precioDeUnaColumna(){
        double precioColumna=0;
        //columna=0
        int j=0;
        for(int i=0; i<2; i++){
            precioColumna+=estanteria[i][j].getPrecio();
        }
        return precioColumna;
    }
    
    public void eliminarBebida(int id){
        boolean lleno=true;
        for(int i=0; i<2 && lleno; i++){
            for(int j=0; j<2 && lleno; j++){
                if(estanteria[i][j]!=null && estanteria[i][j].getId()==id){
                    estanteria[i][j]=null;
                    lleno=false;
                }
            }
        }
        if(lleno==false){
            System.out.println("se saco la bebida");
        }
        else{
            System.out.println("no hay bebida en el lugar");
        }
    }

    @Override
    public String toString() {
        return "Almacen{" + "estanteria=" + estanteria + '}';
    }
    
    
}
