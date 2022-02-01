
package eggpoo3;
import java.util.Scanner;

public class Operacion {
    Scanner Entrada = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.print("Ingrese el primer numero: ");
        this.setNumero1(Entrada.nextInt());
        System.out.print("Ingrese el segundo numero: ");
        this.setNumero2(Entrada.nextInt());
    }
    
    public int sumar(){
        return this.getNumero1() + this.getNumero2();
    }
    
    public int restar(){
        return this.getNumero1() - this.getNumero2();
    }
    
    public int multiplicar(){
        if (this.getNumero1() == 0 || this.getNumero2() == 0){
            return 0;
        }else{
            return this.getNumero1() * this.getNumero2();
        }
        
    }
    public int dividir(){
        if (this.getNumero1() == 0 || this.getNumero2() == 0){
            return 0;
        }else{
            return this.getNumero1() / this.getNumero2();
        }
        
    }
}
