/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package eggpoo10;
import java.util.Random;

public class EggPoo10 {


    public static void main(String[] args) {
        
        double valorAux = 0.0;
        Random rdm = new Random();
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
         
        System.out.println("Llenar el arregloA con valor aleatorios");
        
        for(int i = 0; i < arregloA.length; i ++){
            
            arregloA[i] = rdm.nextInt(50);
            //System.out.println("Elemento: " + (i + 1) + " " + arregloA[i]);
        }
        /*
        arregloA[0] = 48.0;
        arregloA[1] = 44.0;
        arregloA[2] = 10.0;
        arregloA[3] = 20.0;
        arregloA[4] = 35.0;
        */
        System.out.println("Ordenar de menor a mayor el arregloA");
        for(int i = 0; i < arregloA.length; i ++){
            
            for(int j = 0; j < arregloA.length - 1; j ++){
                if(arregloA[j] > arregloA[j + 1] ){
                    
                    valorAux = arregloA[j + 1];
                    arregloA[j + 1] = arregloA[j];
                    arregloA[j] = valorAux;
                }
            
            }   
        }/*
        System.out.println("Mostrar Arreglo Ordenado de menor a mayor");
        for(int i = 0; i < arregloA.length; i ++){
            System.out.println("Elemento: " + (i + 1) + " " + arregloA[i]);
        }*/
        
        for(int i = 0; i < arregloB.length; i ++){
            if(i < 10){
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
        }
        
        System.out.println("Mostrar Arreglo Ordenado de menor a mayor");
        for(int i = 0; i < arregloA.length; i ++){
            System.out.println("Elemento: " + (i + 1) + " " + arregloA[i]);
        }
        System.out.println("Mostrar Arreglo B combinado");
        for(int i = 0; i < arregloB.length; i ++){
            System.out.println("Elemento: " + (i + 1) + " " + arregloB[i]);
        }
        
    }
    
}
