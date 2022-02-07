/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpoo12;
    //estas clases  tambien pueden ser llamadas API de Java
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.time.LocalTime;
import java.time.Month;
/**
 *
 * @author Alfredo
 */
public class localDate {
    //LocalDate no usa new, usa .of ver que onda eso
    LocalDate ld = LocalDate.of(2022,10,05);
    LocalDate ld2 = LocalDate.of(2022,Month.APRIL,05);
    LocalDate ld3 = LocalDate.now();
    LocalDate ld4 = LocalDate.parse("2022,10,05");
    
    
    
}
