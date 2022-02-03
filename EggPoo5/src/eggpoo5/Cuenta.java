
package eggpoo5;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    Scanner Entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = Entrada.nextInt();
        System.out.print("Ingrese el DNI: ");
        dniCliente = Entrada.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        saldoActual = Entrada.nextDouble();
    }
    
    public void ingresar(double monto){
        saldoActual += monto;
    }
    public void retirar(double monto){
        saldoActual -= monto;
    }
    public void extraccionRapida(){
        double montoARetirar = 0.0;
        System.out.print("Retirar hasta un 20% del saldo actual, no más: ");
        montoARetirar = Entrada.nextDouble();
        System.out.println("20 % del saldo actual: " + (saldoActual * 0.20));
        if(montoARetirar  <= (saldoActual * 0.20)){
            System.out.println("Se ha efectuado la extracción");
            saldoActual -= montoARetirar;
        }else{
            System.out.println("Te excediste pá");
        }
        
    }
    
    public void consultarSaldo(){
        System.out.println("El Saldo actual es de : " + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("El número de cuenta es : " + numeroCuenta);
        System.out.println("El Dni es : " + dniCliente);
        System.out.println("El Saldo actual es de : " + saldoActual);
    }
}
