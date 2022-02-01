
package eggpoo1;

import java.util.Scanner;

public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int numero_paginas;

    public Libro() {
        isbn = "";
        titulo = "";
        autor = "";
        numero_paginas = 0;
    }
    
    public Libro(String isbn,String titulo,String autor,int numero_paginas){
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
      
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getIsbn(){
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
    
    
    
    
    public void leerDatosLibro(){
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Isbn?: ");
        //isbn = Entrada.next();
        this.setIsbn(Entrada.next());
        System.out.print("Titulo?: ");
        //titulo = Entrada.next();
        this.setTitulo(Entrada.next());
        System.out.print("Autor?: ");
        //autor = Entrada.next();
        this.setAutor(Entrada.next());
        System.out.print("Numero de paginas?: ");
        //numero_paginas = Entrada.nextInt();
        this.setNumero_paginas(Entrada.nextInt());
        
    }
    
    public void mostrarDatosLibro(){
        
        System.out.println("Isbn: "+ this.getIsbn());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Titulo: "+ this.getTitulo());
        System.out.println("Numero de paginas: "+ this.getNumero_paginas());
    
    }
    
}
