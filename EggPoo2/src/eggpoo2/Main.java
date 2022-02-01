/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpoo2;

/**
 *
 * @author Alfredo
 */
public class Main {

    public static void main(String[] args) {
        
        Circunferencia circu1 = new Circunferencia();
        
        circu1.crearCircunferencia();
        
        System.out.println("Area: " + circu1.area());
        
        System.out.println("Perimetro: " + circu1.perimetro());
    
                
    }
    
}
