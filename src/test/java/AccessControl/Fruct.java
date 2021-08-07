package AccessControl;

public class Fruct {

    //Public -> vizibil in orice clasa; orice clasa trebuie sa fie publica;
    // Protected -> vizibil in clasa curenta + in clasa care mosteneste (clasa copil);
    // Private -> vizibil doar in clasa in care il declari;



    public String nume;
    public String culoare;
    public String forma;
    //OOP - Encapsularea datelor = conceptul pe baza caruia excludem unele date din obiect
    private String pret;

    public Fruct(String nume, String culoare, String forma, String pret) {
        this.nume = nume;
        this.culoare = culoare;
        this.forma = forma;
        this.pret = pret;

    }

    public void printNumeFruct() {
        System.out.println(nume);

    }

    protected void printCuloare() {
        System.out.println(culoare);
    }


    private void printPret() {
        System.out.println(pret);
    }


    //O solutie pentru a transforma private in public -> In interiorul unei metode publice chemi metoda private
    public void afiseazaPret() {
        System.out.println(pret);
    }
}
