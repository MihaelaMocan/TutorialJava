package Mostenire;

public class Masina {

    // OOP Mostenire -> Conceptul prin care o clasa mosteneste o alta clasa;
    // In java poti sa mosteni o singura clasa;
    // Ca sa mostenesti o clasa -> folosim cuvantul extends
    // Clasa care extinde o alta clasa -> subclass; prima data se apeleaza constructorul din clasa de baza; si apoi cel din subclasa
    // Clasa care ii extinsa de o alta clasa -> clasa de baza

    public String model;
    public String culoare;
    public String an;
    public String dotari;
    public String marca;




    public void printInfo() {
        System.out.println("Marca este: " + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Culoarea este: " + culoare);
        System.out.println("Anul este: " + an);
        System.out.println("Dotarile sunt: " + dotari);

    }


    public Masina(String model, String culoare, String an, String dotari, String marca) {
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.dotari = dotari;
        this.marca = marca;
    }
}
