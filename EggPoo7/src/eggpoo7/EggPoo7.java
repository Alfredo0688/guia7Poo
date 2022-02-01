/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package eggpoo7;


public class EggPoo7 {

    public static void main(String[] args) {
        boolean edad1,edad2,edad3,edad4;
        int imc1,imc2,imc3,imc4;
        
        Persona pers1 = new Persona();
        
        pers1.crearPersona();
        System.out.println("IMC : " + pers1.calcularIMC());
        imc1 = pers1.calcularIMC();
        if(pers1.esMayorEdad()){
            System.out.println("Es mayor de edad");
        }
        //System.out.println("Es mayor de edad : " + pers1.esMayorEdad());
        edad1 = pers1.esMayorEdad();
        
        Persona pers2 = new Persona("Pepe", 35, "H", 1.65, 70); 
        System.out.println("IMC : " + pers2.calcularIMC());
        imc2 = pers2.calcularIMC();
        
        System.out.println("Es mayor de edad : " + pers2.esMayorEdad());
        edad2 = pers2.esMayorEdad();
        Persona pers3 = new Persona("Laura", 32, "M", 1.75, 72.8);
        System.out.println("IMC : " + pers3.calcularIMC());
        imc3 = pers3.calcularIMC();
        System.out.println("Es mayor de edad : " + pers3.esMayorEdad());
        edad3 = pers3.esMayorEdad();
        Persona pers4 = new Persona("Mariela", 25, "M", 1.68, 68.7);
        System.out.println("IMC : " + pers4.calcularIMC());
        imc4 = pers4.calcularIMC();
        System.out.println("Es mayor de edad : " + pers4.esMayorEdad());
        edad4 = pers4.esMayorEdad();
        
        
    }
    
}
