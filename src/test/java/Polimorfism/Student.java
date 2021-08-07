package Polimorfism;

public class Student {

    // Polimorfismul : procesul prin care putem creea mai multe copii ale unei metode.
    // 2 tipuri de polimorfism : ^dinamic (Overriding) -> Intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
          //                     ^static (Overloading) -> Daca 2 metode au acelasi nume ele se diferentiaza dupa nr de parametrii sau tipul parametrilor/ ceea ced returneaza metoda.









    String nume;
    String prenume;
    int varsta;
    String adresa;

    public Student(String nume, String prenume,int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;

    }

    public void informatii() {
        System.out.println("Studentul cu detaliile: " + nume + " ," +  prenume + " ," + varsta + " ," + adresa);
    }
}
