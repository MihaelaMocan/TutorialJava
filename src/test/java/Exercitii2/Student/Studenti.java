package Exercitii2.Student;

import java.time.LocalDate;

public class Studenti {

    //4.Student nume si anul nasterii
    public String nume;
    public int an;

    public Studenti(String nume, int an) {
        this.nume = nume;
        this.an = an;

    }


    public String getNume() {
        return nume;
    }
    public int getAn() {
        return an;
    }
    public int getVarsta() {
        int anulCurent = LocalDate.now().getYear();
        return anulCurent - an;

    }
}
