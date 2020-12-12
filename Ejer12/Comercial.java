/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer12;
    

public class Comercial extends Empleado {
    private double comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void plus() {
        double salario;
        if(super.getEdad()>30 && comision >200){
            salario=super.getSalario()+PLUS;
            super.setSalario(salario);
            System.out.println("Tiene el plus, el salario le aumenta 300");
        }
        else {
            System.out.println("no tiene el plus");
        }
    }
    @Override
    public String toString() {
        return "Comerciante "+super.toString()+" comision:" + comision;
    }
    

    
    
}

