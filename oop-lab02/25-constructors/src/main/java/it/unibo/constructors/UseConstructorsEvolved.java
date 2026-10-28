package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).

        // Costruttore a zero argomenti
        Train defaultTrain = new Train();
        defaultTrain.printTrainInfo();

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;

        // Costruttori con parametri
        Train train1 = new Train(20, 200);
        Train train2 = new Train(35, 165);

        train1.printTrainInfo();
        train2.printTrainInfo();
    }
}

//cartella java:
//javac -d ../../../bin it/unibo/constructors/UseConstructorsEvolved.java
//java -cp ../../../bin it.unibo.constructors.UseConstructorsEvolved