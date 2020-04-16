package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Tipo dato, nombre variable -> Instanciar
        Maratonista maratonista = new Maratonista ();

        maratonista.nombre = "Forest Gump";
        maratonista.edad = 30;
        maratonista.energia = 100;

        System.out.println("voy a poner a correr a " + maratonista.nombre);
        
        while (maratonista.correr()){

         if(maratonista.correr()){
            System.out.println(maratonista.nombre + "Comenzo a correr");
            }else{
                System.out.println(maratonista.nombre + "Esta pachucho");
            }
    }

    Basquetbolista basquetbolista = new Basquetbolista();
   
    basquetbolista.nombre = "Manu";
    basquetbolista.entrenar();

    // No habian participantes
    Olimpiada.Participantes.add(maratonista);
    // Hay 1 participante
    Olimpiada.Participantes.add(basquetbolista);
    //Ahora hay 2 participantes

    int cantidadParticipantes;
    cantidadParticipantes = Olimpiada.Participantes.size();

    System.out.print("La cantidad de Participantes es " + cantidadParticipantes);
        /*
        Maratonista maratonista2 = new Maratonista ();
        
        maratonista2.nombre = "Usain Bolt";
        maratonista2.edad = 33;

        System.out.println("voy a poner a correr a "+ maratonista2.nombre);
        maratonista2.correr();
        */
    }
}