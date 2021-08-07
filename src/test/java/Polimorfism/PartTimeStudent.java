package Polimorfism;

public class PartTimeStudent extends Student {

    public PartTimeStudent(String nume, String prenume, int varsta, String adresa) {
        super(nume, prenume, varsta, adresa);
    }


    //Aplicam polimoorfismul dinamic cu super


    public void informatii() {

        super.informatii();
        System.out.println("Stundentul este part-time. ");

    }

    //Aplicam polimorfismul static

    public void calculMedie(double nota1, double nota2) {
        double suma = nota1 + nota2;
        System.out.println("Media este: " + suma/2);
    }
    public void calculMedie(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        System.out.println("Media este: " + suma/3);

    }


}
