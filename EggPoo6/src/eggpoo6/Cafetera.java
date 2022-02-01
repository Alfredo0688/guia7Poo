
package eggpoo6;


public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.setCantidadActual(this.getCapacidadMaxima());
    }
    
    public void servirTaza(int cantidad){
        int taza = 0;
        if(this.getCantidadActual()< cantidad){
            taza = this.getCantidadActual();
            System.out.println("La tasa no se llenó, quedó en: "+ taza);
            this.setCantidadActual(0);
        }else{
            this.setCantidadActual(this.getCantidadActual() - cantidad);
            System.out.println("La tasa se llenó");
        }
    
    }
    
    public void vaciarCafetera(){
        this.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad){
        if((this.getCantidadActual() + cantidad) <= this.getCapacidadMaxima()){
            this.setCantidadActual(cantidad);
        }
    }
}
