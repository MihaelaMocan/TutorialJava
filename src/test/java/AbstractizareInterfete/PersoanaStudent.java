package AbstractizareInterfete;

public class PersoanaStudent extends Persoana implements Student{

    //Mostenire = extends (O clasa se mosteneste);
    //Interfata = implements (O interfata se implementeaza);
    //O clasa poate implementa mai multe interfete;
    //Cand o clasa implementeaza o interfata => clasa trebuie sa ofere implementari
    //pentru toate metodele interfeti;


    public PersoanaStudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void invata() {
        System.out.println("Studentul " + getNume() + getPrenume() + " invata");
    }

    @Override
    public void detaliiStudent() {
        System.out.println(super.toString());
    }

}
