
package eggpoo12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Persona {
    Scanner Entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona(){
        int anio = 0;
        int mes = 0;
        int dia = 0;
        System.out.print("Ingrese el nombre de la persona: ");   
        nombre = Entrada.next();
        System.out.print("Ingrese el año: ");
        anio = Entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = Entrada.nextInt();
        System.out.print("Ingrese el dia: ");
        dia = Entrada.nextInt();
        fechaNacimiento = new Date(anio,mes,dia);
        
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        return fechaActual.getYear() + 1900 - fechaNacimiento.getYear();
    }
    public boolean menorQue(int edad){
        
        if( this.calcularEdad() < edad){
            return true;
        }
        return false;
    }
    
    public void mostrarPersona(){
        
        System.out.println("El nombre de la persona es : " + nombre);
        System.out.println("Año de nacimiento de la persona es : " + fechaNacimiento.getYear());
        System.out.println("Dia de nacimiento de la persona es : " + fechaNacimiento.getDay());
        System.out.println("Mes de nacimiento de la persona es : " + fechaNacimiento.getMonth());
        System.out.println("Edad de la persona: " + this.calcularEdad() + " Años");
        
    }
}
