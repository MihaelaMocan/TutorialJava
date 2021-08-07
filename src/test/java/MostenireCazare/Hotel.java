package MostenireCazare;

public class Hotel extends Cazare{
    public Hotel(String nume, double pret, String nrCamere, String dotari, int etaj, int clasificareStele) {
        super(nume, pret, nrCamere, dotari, etaj, clasificareStele);
    }

    public void afiseazaDetalii(){
        System.out.println("Hotelul are numele: " + getNume() + ". Nr.camere = " + getNrCamere() + ". Are ca dotari: " + getDotari() + ". Este la etajul: " + getEtaj() + ". Are pretul: " +getPret() + ". Numar de stele: " + getClasificareStele());

    }

}
