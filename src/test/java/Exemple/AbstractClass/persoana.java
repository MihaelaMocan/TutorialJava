package exemple.AbstractClass;

public abstract class persoana {
    // O clasa abstracta are ca rol sa defineasca comportamentul unei clase
    // se foloseste cuvantul "abstract" ca sa specifici ca e o clasa abstracta
    // O clasa abstracta poate sau nu sa contina metode abstracte;
    // O clasa abstracta se extinde, nu se implementeaza ;
    // O clasa abstracta poate implementa o interfata;
    // Interfata poate implement doar alta interfata;
    // Metodele abstracte trebuie sa contina cuvantul abstract in fata ;
    //*loadable component*;
    // O clasa abstracta poate sa contina un constructor;
    // Interfata nu poate sa contina un constructor;
    //

    abstract void munceste();
    abstract void invata();

    public persoana(){}

    public void detaliipersoana(){
        System.out.println("Detaliile despre persoana sunt ");
    }






}
