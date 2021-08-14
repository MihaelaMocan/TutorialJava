package AbstractizareInterfete;

public class PersoanaAngajat extends Persoana implements Angajat{
    public PersoanaAngajat(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + getNume() + getPrenume() + " munceste");
    }

    @Override
    public void detaliiAngajat() {
        System.out.println(super.toString());

    }
}
