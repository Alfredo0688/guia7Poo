/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package eggpoo1;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        //Scanner Entrada = new Scanner(System.in);
        
        Libro libro1 = new Libro();
        
        libro1.leerDatosLibro();
        libro1.mostrarDatosLibro();
        
    }
    
}
