package Encapsularea;

public class Student extends Persoana{
    public Student(String nume, String prenume, int varsta, String cnp) {
        super(nume, prenume, varsta, cnp);
    }

    public void afiseazaDetaliiStudent() {



        System.out.println("Numele este: " + getNume());
        System.out.println("Prenumele este: " + getPrenume());
        System.out.println("Varsta este: " + getCnp());
        System.out.println("Cnp-ul este: " + getCnp());
    }

    public void modificaDate(String nume, String prenume) {
        setNume(nume);
        setPrenume(prenume);
    }

}
