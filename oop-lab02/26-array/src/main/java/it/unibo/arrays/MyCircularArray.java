package it.unibo.arrays;

import java.util.Arrays;

class MyCircularArray {

    int[] array;
    private int nextIndex;

    MyCircularArray(int size){
        this.array = new int[size];
        nextIndex = 0;
    }

    MyCircularArray() {
        this(10);
    }

    // Aggiunge un elemento in modo circolare
    public void add(final int element) {
        array[nextIndex] = element;
        nextIndex = (nextIndex + 1) % array.length;
    }

    // Reinizializza tutti gli elementi a zero
    public void reset() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        nextIndex = 0;
    }

    // Sovrascrive il metodo toString per stampare l'array
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        MyCircularArray circ = new MyCircularArray(5);

        // Aggiunge elementi da 1 a 5
        for (int i = 1; i <= 5; i++) circ.add(i);
        System.out.println(circ); // [1, 2, 3, 4, 5]

        // Sovrascrive i primi due elementi
        circ.add(6);
        circ.add(7);
        System.out.println(circ); // [6, 7, 3, 4, 5]

        // Reset dell'array
        circ.reset();
        System.out.println(circ); // [0, 0, 0, 0, 0]

        // Esempio con array circolare di 10 elementi
        MyCircularArray circ10 = new MyCircularArray();
        for (int i = 1; i <= 10; i++) circ10.add(i);
        System.out.println(circ10); // [1,2,3,4,5,6,7,8,9,10]

        for (int i = 11; i <= 15; i++) circ10.add(i);
        System.out.println(circ10); // [11,12,13,14,15,6,7,8,9,10]

        circ10.reset();
        System.out.println(circ10); // [0,0,0,0,0,0,0,0,0,0]

        circ10.add(42);
        circ10.add(99);
        System.out.println(circ10); // [42,99,0,0,0,0,0,0,0,0]

        // 1) Creare un array circolare di dieci elementi

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare

        // 4) Invocare il metodo reset

        // 5) Stampare il contenuto dell'array circolare

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
    }
}

//java % javac -d ../../../bin it/unibo/arrays/*.java
//java % java -cp ../../../bin it.unibo.arrays.MyCircularArray