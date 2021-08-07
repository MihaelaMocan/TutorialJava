package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {


    @Test

    public void testPartTime() {
        PartTimeStudent stud1 = new PartTimeStudent("Popescu", "Mihai", 22, "Str.21Decembrie");
        stud1.informatii();


        FullTimeStudent stud2 = new FullTimeStudent("Marc", "Ionut", 21, "Str.Decebal");
        stud2.informatii();


        stud1.calculMedie(2,3,4);

    }
}
