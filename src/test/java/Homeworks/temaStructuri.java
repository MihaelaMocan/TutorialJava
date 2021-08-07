package Homeworks;

import org.junit.Test;

public class temaStructuri {

    @Test
    public void metodaTest() {
        numereCuValoriDiferite(3, 3, 4);
        afiseazaCuvantulDa();
        afiseazaCuvantul();
        numereDivCu3();
        numereDivCu5();
        numerePozitiveSiPare();
        sumaNumerelor();
        produsulNumerelor();
        numereDivCu3FOR();
        numereDivCu5FOR();
        numerePozitiveSiPareFor();
        sumaNumerelorFor();
        produsulNumerelorFor();

    }

    //Citim 3 numere cu valori diferite. Daca suma primelor 2 numere este mai mare decat al 3-lea numar afisam mesaj corespunzator + valoarea sumei,
    //altfel afisam contrariul;

    public void numereCuValoriDiferite(int a, int b, int c) {
        int suma = a + b;
        if (suma > c) {
            System.out.println("Suma primelor 2 numere este mai mare decat al 3-lea numar: " + suma);
        } else {
            System.out.println("Suma primelor 2 numere este mai mica decat al 3-lea numar");
        }
    }

    //Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public void afiseazaCuvantulDa() {
        String cuvant = "DA";
        int i = 1;
        while (i <= 5) {
            i++;
            System.out.print(cuvant + " ");

        }
    }


    //Problema de mai sus intr-un altfel rezolvata;
    public void afiseazaCuvantul() {
        String cuvant = "DA";
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(cuvant + " ");
        }
        System.out.println();
    }


    //Primele 5 numere divizibile cu 3;
    public void numereDivCu3() {
        int i = 1;
        int counter = 0;

        while (counter < 5) {
            if (i % 3 == 0) {
                System.out.println("Primele 5 numere divizibile cu 3 sunt: " + i);
                counter++;
            }
            i++;
        }
    }   //Primele 5 numere divizibile cu 3;

    public void numereDivCu3FOR() {
        int counter = 1;
        for (int i=1;counter <=5;i++) {
            if (i % 3 == 0) {
                System.out.println("Numerele divizibile cu 3 sunt: " + i);
                counter++;
            }
        }
    }

    //Primele 3 numere divizibile cu 5;
    public void numereDivCu5() {
        int i = 1;
        int counter = 0;
        while (counter < 3) {
            if (i % 5 == 0) {
                System.out.println("Primele 3 numere divizibile cu 5 sunt: " + i);
                counter++;
            }
            i++;
        }
    }
    // Primele 3 numere divizibile cu 5;
    public void numereDivCu5FOR() {
        int counter = 1;
        for (int i=1; counter<=3;i++) {
            if (i%5==0) {
                System.out.println("Primele 3 numere divizibile cu 3 sunt: " + i);
                counter++;
            }
        }
    }
    //Primele 4 numere pozitive si pare;
    public void numerePozitiveSiPare() {
        int i = 1;
        int counter = 0;

        while (counter < 4) {
            if (i % 2 == 0) {
                System.out.println("Primele 4 numere pozitive si pare sunt: " + i);
                counter++;
            }
            i++;
        }
    }

    //Primele 4 numere pozitive si pare cu for;
    public void numerePozitiveSiPareFor() {

        int counter = 1;
        for (int x=1;counter<=4;x++) {
            if (x%2==0 && x >0) {
                System.out.println(x);
                counter++;
            }
        }
    }

    //Suma numerelor pana la 10;
    public void sumaNumerelor() {
        int i = 0;
        int suma = 0;

        while (i <= 10) {
            i++;
            suma = suma + i;
        }
        System.out.println("Suma numerelor pana la 10 este: " + suma);
    }
    //Suma numerelor pana la 10 cu For;
    public void sumaNumerelorFor() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma +i;
        }
        System.out.println(suma);
    }


    //Produsul numerelor pana la 5;
    public void produsulNumerelor() {
        int i = 1;
        int produs = 1;
        while (i<=5) {
            produs = produs * i;
            i++;
        }
        System.out.println("Produsul numerelor pana la 5 este: " +produs);
    }
    //Produsul numerelor pana la 5 cu FOR;
    public void produsulNumerelorFor() {
        int produs = 1;
        for (int i = 1; i <= 5; i++) {
            produs = produs * i;
        }
        System.out.println("Produsul numerelor pana la 5 este: " + produs);
    }


// Problemele de mai sus in for/while in functie de ce aborare;

}