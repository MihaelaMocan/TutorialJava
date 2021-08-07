package MostenireCazare;

public class Pensiune extends Cazare{
    public Pensiune(String nume, double pret, String nrCamere, String dotari, int etaj, int clasificareStele) {
        super(nume, pret, nrCamere, dotari, etaj, clasificareStele);
    }

    @Override
    public void printInformatii() {

    }


    public void nrTuristi() {
        System.out.println("In pensiunea:  " + getNume() + " s-au cazat 1200 de turisti.");
    }



}
