package Exemple;

import java.util.List;

public class Telefon {

    //OOP-Programare orientata obiect;
    //Constructor = are ca rol sa initializeze variabilele unei clase;
    //Constructor = public + nume clasa + (poate sau nu sa aiba parametrii) + {};
    //Intr-o clasa exista un constructor fara parametrii;
    //Poti sa ai mai multi constructori intr-o clasa;


    //Value type : public int age; (Spatiu in memorie dat de cineva-Primitive cu litere mici)
    // Reference type : public Integer age; (Tu ii dai spatiu in memorie)

    public String Marca;
    public String Model;
    public String Culoare;
    public Boolean Camera;


    //Constructor
    public Telefon(String Marca, String Model, String Culoare, Boolean Camera) {
        this.Marca = Marca;
        this.Model = Model;
        this.Culoare = Culoare;
        this.Camera = Camera;
    }
    //Constructor 2
    public Telefon(String Marca, String Model, String Culoare) {
        this.Marca = Marca;
        this.Model = Model;
        this.Culoare = Culoare;
    }

    public void printMarca() {

        System.out.println("Marca telefonul este " + Marca);
    }

    public void printCuloare() {
        System.out.println("Culoarea telefonului este " + Culoare);
    }

    public void areIncarcator() {
        if (Marca.equals("Iphone")) {
            System.out.println("Nu are incarcator.");
        }
        else {
            System.out.println("Are incarcator.");
        }
    }

    public void areCamera() {
        if (Camera==null || Camera.equals(false)) {
            System.out.println("Nu are camera.");
        }
        else {
            System.out.println("Are camera.");
        }
    }

    public void printModel() {
        System.out.println("Modelul telefonului este: " + Model);
    }


    public void numarTelefoaneStoc(List<Telefon> telefoane) {
        System.out.println("Numarul telefoanelor din stoc este: " + telefoane.size());


    }

}
