
package eggpoo7;

import java.util.Scanner;
public class Persona {
    Scanner Entrada = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo = "P";
    private double altura;
    private double peso;

    public Persona(String nombre, int edad, String sexo, double altura,double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public void crearPersona(){
        System.out.print("Ingrese el nombre ");
        this.setNombre(Entrada.nextLine());
        System.out.print("Ingrese la edad ");
        this.setEdad(Entrada.nextInt());
        System.out.println("nada");
        while(!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O") ){
            System.out.print("Ingrese el sexo ");
            this.setSexo(Entrada.next());
        }
        
        System.out.print("Ingrese la altura ");
        this.setAltura(Entrada.nextDouble());
        System.out.print("Ingrese el peso ");
        this.setPeso(Entrada.nextDouble());
    }
    
    public int calcularIMC(){
        double imc = this.getPeso() / Math.pow(this.getAltura(), 2);
        if(imc < 20){
            return -1 ;
        }else if(imc > 25){
            return 1;
        }else{
            return 0;
        }
    }
    
    public boolean esMayorEdad(){
        return this.getEdad() >= 18; 
    }
}
