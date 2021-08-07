package AccessControl;

import org.junit.Test;

public class FructTest {

    @Test

    public void metodaTest(){

        System.out.println("Exemple: PUBLIC");
        Fruct obiect = new Fruct("piersica", "rosie", "rotunda", "5  lei");
        Banana banana = new Banana("banana", "galbena", "cilindrica", "4 lei");

        obiect.printNumeFruct();
        banana.printNumeFruct();


        obiect.printCuloare();
        banana.printCuloare();

        obiect.afiseazaPret();
        banana.afiseazaPret();


    }
}
