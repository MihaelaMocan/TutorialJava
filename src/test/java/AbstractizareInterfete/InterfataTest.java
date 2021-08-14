package AbstractizareInterfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void metodaTest() {


        PersoanaStudent Alex = new PersoanaStudent("Dorha", " Alex", 26, "Restantier");
        Alex.invata();
        Alex.detaliiStudent();

        PersoanaAngajat Alina = new PersoanaAngajat("Pop", " Alina", 28, "Politista");
        Alina.munceste();
        Alina.detaliiAngajat();

        PersoanaAngajatStudent Mihaela = new PersoanaAngajatStudent("Mocan", "Mihaela", 27, "Receptioner");
        Mihaela.invata();
        Mihaela.munceste();
        Mihaela.detaliiAngajat();
        Mihaela.detaliiStudent();

    }

}
