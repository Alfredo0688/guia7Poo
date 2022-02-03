/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package eggpoo5;


public class EggPoo5 {

   
    public static void main(String[] args) {
       
        Cuenta cuenta1 = new Cuenta();
        cuenta1.crearCuenta();
        
        System.out.println("Getters");
        System.out.println("Dni: " + cuenta1.getDniCliente());
        System.out.println("Saldo Actual: " + cuenta1.getSaldoActual());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        /*
        System.out.println("agregamos 5000 pé");
        cuenta1.ingresar(5000);
        System.out.println("Saldo Actual: " + cuenta1.getSaldoActual());
        System.out.println("quitamos 2000 pé");
        cuenta1.retirar(2000);
        System.out.println("Saldo Actual: " + cuenta1.getSaldoActual());*/
        System.out.println("Metodo extraccion rapida");
        cuenta1.extraccionRapida();
        System.out.println("Saldo Actual: " + cuenta1.getSaldoActual());
    }
    
}
