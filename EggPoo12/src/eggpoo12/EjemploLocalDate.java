/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpoo12;

import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class EjemploLocalDate {

    public static void main(String[] args) {
         //LocalDate no usa new, usa .of ver que onda eso
        LocalDate ld = LocalDate.of(2022,10,05);
        LocalDate ld2 = LocalDate.of(2022,Month.APRIL,05);
        LocalDate ld3 = LocalDate.now();
        LocalDate ld4 = LocalDate.parse("2022,10,05");
        System.out.println("ld4: " + ld4);
    
        //devuelve un bool si la fecha es mayor que la pasada como parametro
        System.out.println(ld.isAfter(ld4));
        
        //devuelve un bool si la fecha es menor que la pasada como parametro
        System.out.println(ld.isBefore(ld4));
        
        System.out.println("restar 10 dias a una fehca: " + ld.minusDays(10) );
        
        System.out.println("sumar 10 años a una fehca: " + ld.plusYears(10) );
        
        System.out.println("sumar 5 meses a una fehca: " + ld4.plusMonths(5) );
    }
    
}
