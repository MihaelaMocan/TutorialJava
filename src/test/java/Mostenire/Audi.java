package Mostenire;

public class Audi extends Masina{

    // In momentul in care o clasa mostesteste o alta clasa => prima data se apeleaza constructorul din clasa parinte, si apoi din clasa copil;
    // Ca sa apelezi constructorul dintr-o clasa parinte, tu fiind in clasa copil => super


    public Audi(String model, String culoare, String an, String dotari, String marca) {
        super(model, culoare, an, dotari, marca);
    }



    public void rezistentaMasina() {
        System.out.println("Masina cu marca "+ marca + " din anul " + an + " cu modelul " + model + " se strica repede.");
    }


    public void afiseazaDetaliiModel() {
        System.out.println("Detalii despre o masina Audi: ");
        printInfo();
    }
}
