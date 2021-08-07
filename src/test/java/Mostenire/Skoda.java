package Mostenire;

public class Skoda extends Masina {


    public Skoda(String model, String culoare, String an, String dotari, String marca) {
        super(model, culoare, an, dotari, marca);
    }


    public void esteElectrica() {
        System.out.println("Masina cu marca "+ marca + " din anul " + an + " cu modelul " + model + " este electrica.");
    }
    public void afiseazaDetalii() {
        System.out.println("Detalii despre o masina Skoda: ");
        printInfo();
    }

}
