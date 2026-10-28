package it.unibo.constructors;

class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    /*
    void build(final int id, final String name, final String surname, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
    }
    */

    Student(int id, final String name, final String surname, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }

    public static void main(final String[] args) {
        /*
        final Student marioRossi = new Student();
        marioRossi.build(1014, "Mario", "Rossi", 2013);
        marioRossi.printStudentInfo();

        final Student luigiGentile = new Student();
        luigiGentile.build(1015, "Luigi", "Gentile", 2012);
        luigiGentile.printStudentInfo();

        final Student simoneBianchi = new Student();
        simoneBianchi.build(1016, "Simone", "Bianchi", 2010);
        simoneBianchi.printStudentInfo();

        final Student andreaBracci = new Student();
        andreaBracci.build(1017, "Andrea", "Bracci", 2012);
        andreaBracci.printStudentInfo();
        */
       Student marioRossi = new Student(1014, "Mario", "Rossi", 2013);
       Student lucaBianchi = new Student(1015, "Luca", "Bianchi", 2012);
       Student peppinoVitiello = new Student(1016, "Peppino", "Vitiello", 2010);
       Student lucaVerdi = new Student(1017, "Luca", "Verdi", 2012);
       
       marioRossi.printStudentInfo();
       lucaBianchi.printStudentInfo();
       peppinoVitiello.printStudentInfo();
       lucaVerdi.printStudentInfo();
    }
}

//javac -d ../../../bin it/unibo/constructors/Student.java
//java -cp ../../../bin it.unibo.constructors.Student