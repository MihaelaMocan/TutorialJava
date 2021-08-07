package Mostenire;

public class Renault extends Masina{

    //Clasa renault va deveni clasa Parinte pentru subclasa Dacia
    public Renault(String model, String culoare, String an, String dotari, String marca) {
        super(model, culoare, an, dotari, marca);
    }

    public void afiseazaInformatii() {
        System.out.println("Masina este un renault.");
    }
}
