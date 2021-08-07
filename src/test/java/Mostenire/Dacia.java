package Mostenire;

public class Dacia extends Renault{
    public Dacia(String model, String culoare, String an, String dotari, String marca) {
        super(model, culoare, an, dotari, marca);
    }

    public void afiseazaInformatii() {
        System.out.println("Masina este o dacie.");
    }
}
