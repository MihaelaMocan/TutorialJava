package exemple.AbstractClass;

import org.junit.Test;

public class AbstractClassTest {



    @Test
    public void testamclasaAbstracta(){
        PersoanaAngajat AngajatulMihai = new PersoanaAngajat(" Afloarei "," Mnihai ", 25,"Curier");
        PersoanaStudent StudentulAndrei = new PersoanaStudent("Apepu", " Andrei", 27, " medicina");
        PersoanaStudentsiAngajat MihaiAndrei  =  new PersoanaStudentsiAngajat("Mihai","Andrei",235, "Curiei si medicina");


System.out.println("Angajat: ");
        AngajatulMihai.munceste();
        AngajatulMihai.detaliiangajat();
        AngajatulMihai.invata();
        System.out.println("Student: ");
         StudentulAndrei.invata();
         StudentulAndrei.detaliistudent();
        System.out.println("Angajat si Student: ");
         MihaiAndrei.munceste();
         MihaiAndrei.invata();


    }
}
