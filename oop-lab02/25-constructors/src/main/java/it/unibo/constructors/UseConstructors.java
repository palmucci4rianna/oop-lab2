package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013

        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010

        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013

        Student marioRossi = new Student(1014, "Mario", "Rossi", 2013);
        Student lucaBianchi = new Student(1015, "Luca", "Bianchi", 2012);
        Student peppinoVitiello = new Student(1016, "Peppino", "Vitiello", 2010);
        Student lucaVerdi = new Student(1017, "Luca", "Verdi", 2012);
       
        marioRossi.printStudentInfo();
        lucaBianchi.printStudentInfo();
        peppinoVitiello.printStudentInfo();
        lucaVerdi.printStudentInfo();

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe

        // 7) Creare un treno con 500 posti, tutti di seconda classe

        // 8) Creare un treno con numero di posti di default

        Train train1 = new Train(100, 200);     // 300 posti, 100 prima classe, 200 seconda
        Train train2 = new Train(50, 1050);     // 1200 posti, 50 prima, 1050 seconda
        Train train3 = new Train(0, 500);       // 500 posti, tutti seconda classe
        Train train4 = new Train();             // numero posti di default

        train1.printTrainInfo();
        train2.printTrainInfo();
        train3.printTrainInfo();
        train4.printTrainInfo();

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        if (train4.getTotalSeats() > 0 &&
            train4.getTotalSeats() == train4.getFirstClassSeats() + train4.getSecondClassSeats()) {
            System.out.println("Train a posti di default consistente ✅");
        } else {
            System.out.println("Errore: Train a posti di default non consistente ❌");
        }
    }
}

//cartella java:
//javac -d ../../../bin it/unibo/constructors/UseConstructors.java
//java -cp ../../../bin it.unibo.constructors.UseConstructors