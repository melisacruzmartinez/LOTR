package app;

/**
 * Maratonista
 */
public class Maratonista extends Deportista {

    public int velocidadActual;
    public int kmRecorridos;
    public int energia;
    public boolean batioRecordMundial;

    public boolean correr() {
       if(this.energia > 0)
       {
           this.velocidadActual = 20;
           this.energia -=10;//this.energia= this.energia -10
          // this.playAnimacionCorrer(); 
           return true;
        }
        else
            return false;
         //System.out.println(this.nombre + "OK, comence a correr");

    }
    public void acelerar(){
        System.out.println("Acelerando...");
        this.velocidadActual++;
    }
}