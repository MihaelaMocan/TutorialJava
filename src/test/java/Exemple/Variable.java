package Exemple;

import org.junit.Test;

public class Variable {

    // Clasa = o colectie de variabile si metode
    // Structura = access control(public) + class + nume clasa + acolade
    // Intr-un fisier java poti sa ai mai multe clase
    // Fiecare clasa trebuie sa aiba un nume diferit
    // Daca vrem mai  multe clase intr-un fisier => o singura clasa e public si restul nu

    // Variabila = atributul unei clase
    // Tipuri variabile = 2 tipuri - Globale si Locale
    // Structura globala = access control(public) + tip variabila + numele variabilei + ;
    // Structura locala = tip variabila + numele variabilei
    // O variabila poate sau nu sa primeasca o valoare


    public int numar;
    public char litera;
    public String nume;
    public double numarVirgula;

    // O metoda = o actiune pe care o poate face o clasa cu sau fara variabile;
    // Metodele sunt de 2 tipuri = 1. Method void (metode care ne arata ceva)
    //                             2. Method return (metode care returneaza ceva)
    // Structura metoda void = access control (public) + void  (tip metoda) + nume + paranteze rotunde + {}
    // Metodele pot sau nu sa contina parametrii
    // Parametrii fac referire la valori care vin din afara metodei

    // Facem o metoda de test
    // Ca sa fie o metoda de test ma folosesc de JUnit
    // JUnit = @Test
    @Test
    public void metodaTest() {
        // Apelez metoda care afiseaza numele pe tastatura;
        afisareNumeTastatura();
        afiseazaDataSiZiua();
        initializeazaVariabilele();
        afisareNumeGeneral("Ana");
        afisareNumeGeneral("Maria");
        calculeazaSumaNumereIntregi(2, 3, 4);
        calculeazaSumaNumereIntregi(3, 3 , 4);
        System.out.println(getSalariulUnuiAngajat());
        System.out.println(getMesaj());
    }
    //
    // Metoda care imi afiseaza numele pe tastatura
    public void afisareNumeTastatura(){
        nume = "Mihaela";
        System.out.println("Cerinta 1: ");
        System.out.println(nume);
    }

    // Metoda care imi afiseaza un nume pe tastatura
    // Parametrii se scriu intre paranteze rotunde, se delimiteaza cu virgula
    // Parametrii au structura ca o variabila locala

    public void afisareNumeGeneral(String numeGeneral) {
        nume = numeGeneral;
        System.out.println("Cerinta 4: ");
        System.out.println(numeGeneral);
    }

    // Metoda care afiseaza data si ziua de azi
    public void afiseazaDataSiZiua() {
        String data = "10 iulie 2021";
        String zi = "sambata";
        System.out.println("Cerinta 2: ");
        System.out.print(data + " ");
        System.out.println(zi);
    }

    // Metoda care intializeaza restul variabelor
    public void initializeazaVariabilele() {
        numarVirgula = 2.5;
        numar = 3;
        litera = 'A';
        System.out.println("Cerinta 3: ");
        System.out.println(numarVirgula);
        System.out.println(numar);
        System.out.println(litera);
    }

    // Metoda care calculeaza suma a 3 numere intregi
    public void calculeazaSumaNumereIntregi(int nr1, int nr2, int nr3) {
        System.out.println("Cerinta 5: ");
        int suma = nr1 + nr2 + nr3;
        System.out.println("Suma numerelor este: "+ suma);

    }

    //Metoda care returneaza salariul unui angajat
    // Structura metoda return = access control (public) + tip de valoare pe care il returneaza + nume(){}
    public double getSalariulUnuiAngajat() {
       System.out.println("Cerinta 6: ");
        double salar = 10545.33;
        return salar;

    }
    // Metoda care returneaza un mesaj
    public String getMesaj() {
        System.out.println("Cerinta 7: ");
        String mesaj = "Mesajul este: ";
        return mesaj;


    }

}

