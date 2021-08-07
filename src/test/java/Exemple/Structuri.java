package Exemple;

import org.junit.Test;

public class Structuri {
    // 2 tipuri de structuri: Alternative si repetitive
    // alternativa: daca ...(conditie) ..atunci
    //                                 altfel
    // repetitive: se executa o bucata de cod de 1...n ori
    // repetitive: while sau for

    @Test
    public void metodaTest() {
        verificaNumere(5, 4);
        verificaNumere(2, 5);
        verificaNumere(2, 2);
        propozitieCuvant("Ana are mere", "mere");
        propozitieCuvant("Aba are mere", "pere");
        verificaDacaContineMaiMulteCuvinte("Ana are mere", "are", "mere");
        verificaDacaContineMaiMulteCuvinte("Ana are mere", "b", "are");
        afiseazaNumere();
        afiseazaNr();
        afiseazaNumereWhile();
        sumaNumerelor();
        afiseaza5Numere();
        afisamNrPare();
        afisamNrImpare();
        sumaNumerelorPare();
    }

    // Verificam daca numarul 5 > 3
    //verificam daca primul nr > al doilea
    public void verificaNumere(int a, int b) {
        if (a > b) {
            System.out.println("Corect");
        } else {
            System.out.println("Incorect");

        }
    }

    //Verificam daca o propozitie contine un anumit cuvant
    public void propozitieCuvant(String propozitie, String cuvant) {
        if (propozitie.contains(cuvant)) {
            System.out.println("Propozitia contine cuvantul");
        } else {
            System.out.println("Propozitia nu contine cuvantul");
        }
    }


    //Verificam daca o propozitie contine mai multe cuvinte
    public void verificaDacaContineMaiMulteCuvinte(String prop, String cuvant1, String cuvant2) {
        if (prop.contains(cuvant1) || (prop.contains(cuvant2))) {
            System.out.println("Propozitia contine cuvintele");
        } else {
            System.out.println("Propozitia nu contine cuvintele");

        }
    }

    //FOR --> 3 conditii: 1. De la ce numar incepi
    //                    2. Conditia pana cand se parcurg
    //                    3. Conditia sa treaca la elementul urmator

    // Afisam pe tastatura primele 100 de numere
    public void afiseazaNumere() {
        for (int index=0; index<101; index++) {
            System.out.println("Numarul " + index);
        }
    }

    // Afisam nr de la 100 la 0
    public void afiseazaNr() {
        System.out.println("Numerele de la 100 la 0");
        for (int i=100; i>=0; i--) {
            System.out.println(i);

        }
    }

    public void afiseazaNumereWhile() {
        int index =0;
        while (index<=100) {
            System.out.println(index);
            index++;
        }
    }
    // Calculeaza suma primelor 5 numere de la 1 la 20
    public void sumaNumerelor() {
        int sum = 0;
        for (int i=1; i<=20; i++) {
            if (i<=5) {
                sum = sum+i;
            }
        }
        System.out.println("Suma nr este: " +sum);
    }
    // Afisam primele 5 numere din intervalul 1-20;
    public void afiseaza5Numere() {
        for (int i=1; i<=20; i++) {
            if (i<6) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
    // Afisam numere pare de la 1-50;
    public void afisamNrPare() {
        for (int i =1; i <=50; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    // Afisam numere impare de la 1-50
    public void afisamNrImpare() {
        int i = 1;
        while (i<=50) {
            i++;
            if (i%2==1) {
                System.out.println("Numerele impare sunt: " + i);
            }
        }
    }
    // Suma numerelor impare de la 1 la 50;
    public void sumaNumerelorPare() {

        int suma = 0;
        for (int i=1; i<=50; i++) {
            if(i%2==1) {
                suma = suma + i;

        }

        }
    System.out.println(suma);
    }
}