package MostenireCazare;

public class Motel extends Cazare{
    boolean mountainView;

    public Motel(String nume, double pret, String nrCamere, String dotari, int etaj, int clasificareStele, boolean mountainView) {
        super(nume, pret, nrCamere, dotari, etaj, clasificareStele);
        this.mountainView = mountainView;
    }

    @Override
    public void printInformatii() {
        super.printInformatii();

    }

    public void motel() {
            System.out.println("Motelul are numele: " + getNume() + " Are view la munte? " + mountainView);

    }


}
