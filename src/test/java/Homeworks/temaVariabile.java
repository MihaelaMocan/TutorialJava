package Homeworks;

import org.junit.Test;

public class temaVariabile {


    public String helloWorld;
    public int age;
    public String nameSurname;
    public String date;
    public String ziua;
    public double result;
    public double sum;
    public int produs;
    public String salut;
    public String hello;



    @Test
    public void testVariabile() {
        helloWorld();
        age();
        date();
        result();
        sum();
        produs();
        salut();
        hello();


    }

    // Metoda care afiseaza mesajul "Hello Word"
    public void helloWorld() {
        helloWorld = "Hello World";
        System.out.println("Cerinta 1: ");
        System.out.println(helloWorld);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda care afiseaza varsta
    public void age() {
        int age = 27;
        System.out.println("Cerinta 2: ");
        System.out.println(age);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda care afiseaza data de azi
    public void date() {
        date = "15 Iulie 2021";
        ziua = "Sambata";
        System.out.println("Cerinta 3: ");
        System.out.println(date);
        System.out.println(ziua);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda care afiseaza rezultatul la [2+(3*4)- 3]/3
    public void result() {
        result = (2 + 3 * 4 - 3) / 3.0;
        System.out.println("Cerinta 4: ");
        System.out.println(result);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda suma a 3 nr double
    public void sum() {
        sum = 3.5 + 4.5 + 5.5;
        System.out.println("Cerinta 5: ");
        System.out.println(sum);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda produsul a 2 nr integer
    public void produs() {
        produs = 3 * 3;
        System.out.println("Cerinta 6: ");
        System.out.println(produs);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda care adauga la Salut caracterul "M" la final
    public void salut() {
        salut = "Salut";
        System.out.println("Cerinta 7: ");
        System.out.println(salut + "M");
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }

    // Metoda care adauga la hello caracterul "H" la inceput
    public void hello() {
        hello = "Hello";
        System.out.println("Cerinta 8: ");
        System.out.println("H" + hello);
        System.out.println("Poti pleca acasa, dupa ce iti verific munca");
    }
}