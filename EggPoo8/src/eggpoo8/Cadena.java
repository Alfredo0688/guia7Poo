
package eggpoo8;


public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void mostrarVocales(){
        frase = frase.toUpperCase();
        System.out.println(frase);
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        for(int i = 0; i < this.frase.length(); i++){
            System.out.println("letra: " + frase.charAt(i));
            switch(frase.charAt(i)){
                case 'A':
                    contA ++;
                    break;
                case 'E':
                    contE ++;
                    break;
                case 'I':
                    contI ++;
                    break;
                case 'O':
                    contO ++;
                    break;
                case 'U':
                    contU ++;
                    break;
            }
            
        }
        System.out.println("Cantidad A: " + contA);
        System.out.println("Cantidad E: " + contE);
        System.out.println("Cantidad I: " + contI);
        System.out.println("Cantidad O: " + contO);
        System.out.println("Cantidad U: " + contU);
    
    }
    
    public void invertirFrase(){
        for(int i = frase.length() - 1; i >= 0; i --){
            System.out.print(frase.charAt(i));
        }
    }
    
    public int vecesRepetido(String letra){
        int contador = 0;
        for(int i = 0; i < frase.length(); i ++){
            if(letra.equalsIgnoreCase(frase.substring(i, i + 1))){
                contador ++;
            }
            
        }
        return contador;
    }
    
    public void compararLongitud(String frase){
        
        if(frase.length() == this.longitud){
            System.out.println("Las longitudes son iguales");
        }else{
            System.out.println("Las longitudes no son iguales");
        }
    }
    
    public void unirFrase(String frase){
        System.out.println( this.frase.concat(frase) );
    }
    
    public void reemplazar(String letra){
        System.out.println(frase.replace("A",letra ));
    }
    
    public boolean contiene(String letra){
        return frase.contains(letra);
    }
}
