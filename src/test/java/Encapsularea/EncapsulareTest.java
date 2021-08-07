package Encapsularea;

import org.junit.Test;

public class EncapsulareTest {

    @Test

    public void encapsulareTest() {

        Student student1 = new Student("Pop", "Mihai", 24, "32632729297");
        student1.afiseazaDetaliiStudent();
        student1.modificaDate("Pop", "Mihaela");
    }
}



//TEMA-> Sa se transforme in private masini;

