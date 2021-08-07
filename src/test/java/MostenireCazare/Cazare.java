package MostenireCazare;

public class Cazare {

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        if (nume == null || nume.isEmpty()){
            throw new IllegalArgumentException("numele nu poate fi empty");
        }
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(String nrCamere) {
        this.nrCamere = nrCamere;
    }

    public String getDotari() {
        return dotari;
    }

    public void setDotari(String dotari) {
        this.dotari = dotari;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public int getClasificareStele() {
        return clasificareStele;
    }

    public void setClasificareStele(int clasificareStele) {
        this.clasificareStele = clasificareStele;
    }

    private String nume;
    private double pret;
    private String nrCamere;
    private String dotari;
    private int etaj;
    private int clasificareStele;



    public void printInformatii(){
        System.out.println("Unitatea de cazare este: " + nume);
        System.out.println("Unitatea de cazare are pretul: " + pret);
        System.out.println("Unitatea de cazare are: " + nrCamere + "camere");
        System.out.println("Unitatea de cazare are dotarile: " + dotari);
        System.out.println("Unitatea de cazare este la etajul: " + etaj);
        System.out.println("Unitatea de cazare are: " + clasificareStele + " stele");

    }


    public Cazare(String nume, double pret, String nrCamere, String dotari, int etaj, int clasificareStele) {
        this.nume = nume;
        this.pret = pret;
        this.nrCamere = nrCamere;
        this.dotari = dotari;
        this.etaj = etaj;
        this.clasificareStele = clasificareStele;

    }

}
