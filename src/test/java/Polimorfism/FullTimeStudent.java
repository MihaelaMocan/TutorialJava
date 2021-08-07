package Polimorfism;

public class FullTimeStudent extends Student{

    public FullTimeStudent(String nume, String prenume, int varsta, String adresa) {
        super(nume, prenume, varsta, adresa);

    }


    public void informatii() {

        super.informatii();
        System.out.println("Stundentul este full-time. ");
    }

}
