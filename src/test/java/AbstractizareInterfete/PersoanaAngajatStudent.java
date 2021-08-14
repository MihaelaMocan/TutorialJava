package AbstractizareInterfete;

public class PersoanaAngajatStudent extends Persoana implements Student, Angajat {

    public PersoanaAngajatStudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat " + getNume() + getPrenume() + " munceste");
    }

    @Override
    public void detaliiAngajat() {
        System.out.println(super.toString());

    }

    @Override
    public void invata() {
        System.out.println("Studentul angajat " + getNume() + getPrenume() + " invata");
    }

    @Override
    public void detaliiStudent() {
        System.out.println(super.toString());
    }
}
