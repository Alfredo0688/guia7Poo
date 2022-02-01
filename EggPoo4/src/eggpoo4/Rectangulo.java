/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.

 */
package eggpoo4;

import java.util.Scanner;
public class Rectangulo {
    Scanner Entrada = new Scanner(System.in);
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void generarRectangulo(){
        
        System.out.print("Base: ");
        this.setBase(Entrada.nextDouble());
        
        System.out.print("Altura: ");
        this.setAltura(Entrada.nextDouble());
    
    }
    
    public double calcularSuperficie(){
        return this.getAltura() * this.getBase();
    }
    
    public double calcularPerimetro(){
        return 2 * (this.getAltura() + this.getBase());
    }
    
    public void dibujarRectangulo(){
        System.out.println(Math.abs(this.getBase()));
        System.out.println(Math.abs(this.getAltura()));
        //int num = this.getBase();
        for(int i = 0; i < this.getAltura(); i ++){
            for(int j = 0; j < this.getBase(); j ++){
                if((i == 0 ||  j == 0) || (i == this.getAltura() - 1 || j == this.getBase() - 1 ) ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
        
    }
}
