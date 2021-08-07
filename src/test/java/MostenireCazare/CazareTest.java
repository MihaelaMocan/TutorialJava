package MostenireCazare;

import org.junit.Test;

public class CazareTest {


    @Test
    public void test() {

        Cazare cazare1 = new Cazare("Hotel", 200, "30", "balcon", 3, 3);
        cazare1.printInformatii();


        Hotel hotel1 =  new Hotel("Transilvania", 220, "40", "AC", 2, 3);
        hotel1.afiseazaDetalii();
        Hotel hotel2 = new Hotel("Sunset", 190, "20", "cada", 1, 4);
        hotel2.afiseazaDetalii();



        Pensiune pensiune1 = new Pensiune("Astoria", 175, "15", "balcon", 2, 3);
        pensiune1.printInformatii();
        System.out.println("Numarul camerelor este: "+ pensiune1.getNrCamere());
        pensiune1.nrTuristi();


        Motel motel1 = new Motel("Gold Crest", 200, "25", "mountain view", 2, 3, true);
        motel1.motel();
        System.out.println("Motelul are: " + motel1.getNrCamere() + " camere single si duble.");

        Motel motel2 = new Motel("Boutique", 185, "29", "sea view", 2, 3, false);
        System.out.println("Motelul cu numele: " + motel2.getNume() + " Are view la munte? " + motel2.mountainView);



    }
}
