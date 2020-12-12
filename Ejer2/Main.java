package Ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso,altura;
        
        System.out.print("ingrese nombre: ");
        nombre=entrada.nextLine();
        System.out.print("ingrese edad: ");
        edad=entrada.nextInt();
        System.out.print("ingrese sexo: ");
        sexo=entrada.next().charAt(0);
        System.out.print("ingrese peso: ");
        peso=entrada.nextDouble();
        System.out.print("ingrese altura: ");
        altura=entrada.nextDouble();
        Persona p1=new Persona(nombre,edad,sexo,peso,altura);
        
        Persona p2=new Persona("Mariana",19,'M',70,170);
        
        Persona p3=new Persona();
        p3.setNombre("sandra");
        p3.setEdad(30);
        p3.setSexo('M');
        p3.setPeso(60);
        p3.setAltura(1.65);
        
        System.out.println("Datos de la primera persona" );
        switch (p1.calcularIMC()) {
            case -1:
                if(p1.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene bajo peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene bajo peso");
                }   break;
            case 0:
                if(p1.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene peso ideal");
                }
                else{
                    System.out.println("Es menor de edad y tiene peso ideal");
                }   break;
            default:
                if(p1.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene sobre peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene sobre peso");
                }   break;
        }
        System.out.println(p1);
        System.out.println(" ");
        System.out.println("Datos de la segunda persona");
        switch (p2.calcularIMC()) {
            case -1:
                if(p2.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene bajo peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene bajo peso");
                }   break;
            case 0:
                if(p2.esMayordeEdad()){
                    System.out.println("Es mayor de edad y peso ideal");
                }
                else{
                    System.out.println("Es menor de edad y peso ideal");
                }   break;
            default:
                if(p2.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene sobre peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene sobre peso");
                }   break;
        }
        System.out.println(p2);
        System.out.println(" ");
        System.out.println("Datos de la tercera persona");
       switch (p3.calcularIMC()) {
            case -1:
                if(p3.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene bajo peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene bajo peso");
                }   break;
            case 0:
                if(p3.esMayordeEdad()){
                    System.out.println("Es mayor de edad y peso ideal");
                }
                else{
                    System.out.println("Es menor de edad y peso ideal");
                }   break;
            default:
                if(p3.esMayordeEdad()){
                    System.out.println("Es mayor de edad y tiene sobre peso");
                }
                else{
                    System.out.println("Es menor de edad y tiene sobre peso");
                }   break;
        }
        System.out.println(p3.toString());
       
    }
    
}
