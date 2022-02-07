/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package eggpoo11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class EggPoo11 {


    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int anio;
        int mes;
        int dia;
        
        System.out.print("Ingrese el año: ");
        anio = Entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = Entrada.nextInt();
        System.out.print("Ingrese el dia: ");
        dia = Entrada.nextInt();
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        int dif = fechaActual.getYear()+ 1900 - fecha.getYear();
        System.out.println("Diferencia entre los años: " + dif);
        
        
    }
    
}
