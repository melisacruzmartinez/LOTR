package app;
/**
 * Basquetbolista: es un molde para crear jugadores
 */
public class Basquetbolista extends Deportista {

    public int encestadas;
    public String equipo;

    public void lanzar(boolean unTriple){
        if(unTriple)
            System.out.println("Voy a lanzar un triple.");
        else
            System.out.println("voy a lanzar un doble."); 
    }

}

