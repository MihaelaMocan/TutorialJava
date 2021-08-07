package Exemple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TelefonTest {

    //Obiect = instanta unei clase;
    //Obiect = numele clasei + nume obiect = new numele clasei(Se apeleaza constructorul clasei) + valori
    //pentru parametrii daca are;
    //Poti sa ai cate obiecte vrei, dar sa aiba un nume unic;


    @Test
    public void metodaTest() {
        Telefon Samsung = new Telefon("Samsung", "A10", "Negru", true);
        Telefon Iphone = new Telefon("Iphone", "11", "Alb", true);
        Telefon Huawei = new Telefon("Huawei", "15", "Negru", true);
        Telefon Nokia = new Telefon("Nokia", "2001", "Negru");
        Telefon Asus = new Telefon("Asus", "C12", "Gri", true);
        Telefon Siemens = new Telefon("Siemens", "3", "Alb", false);
        System.out.println("-------------------");
        List<Telefon> telefoane = new ArrayList<>();
        telefoane.add(Samsung);
        telefoane.add(Iphone);
        telefoane.add(Huawei);
        telefoane.add(Nokia);
        telefoane.add(Asus);
        telefoane.add(Siemens);
        Samsung.numarTelefoaneStoc(telefoane);
        System.out.println("-------------------");


        Samsung.printMarca();
        Huawei.printMarca();
        Iphone.printCuloare();
        Iphone.printMarca();
        Samsung.areIncarcator();
        Iphone.areIncarcator();
        Nokia.areIncarcator();
        Huawei.areCamera();
        Nokia.areCamera();
        System.out.println("-------------------");
        Samsung.printModel();
        Samsung.Model = "S20";
        Samsung.printModel();
        System.out.println("-------------------");
        Nokia.areCamera();
        Nokia.Camera = true;
        Nokia.areCamera();







    }



}
