
package Ejer12;

public class Repartidor extends Empleado {
    private String zona;
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public Repartidor() {
    }
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
    public void plus() {
        double salario;
        if (super.getEdad()<25 && "zona 3".equals(zona)){
            salario=super.getSalario()+super.PLUS;
            super.setSalario(salario);
        System.out.println("Tiene el plus, el salario le aumenta 300");
        }
        else {
            System.out.println("no tiene el plus");
        }
    }
    
    @Override
    public String toString() {
        return "Repartidor "+super.toString()+" zona:" + zona;
    }
    
    }
    

  
