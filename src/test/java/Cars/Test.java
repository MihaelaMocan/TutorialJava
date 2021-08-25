package Cars;



import java.util.List;

public class Test {

    @org.junit.Test
    public void testFiltruCuloare() {
        Registru reg1 = new Registru();

        List<Car> culoare = reg1.filterByColor("gri");
        Integer lungimea = culoare.size();
        if (lungimea != 2) {
            throw new RuntimeException("SSS");
        }

        for (int i =0; i < lungimea; i++) {
            Car car = culoare.get(i);
            if (!car.getCuloare().contains("gri")) {
                throw new RuntimeException();
            }

        }
        System.out.println("Lungimea e 2");
    }
    @org.junit.Test
    public void verificaDecapotabila() {
        Car masina1 = new Decapotabila("rosie","bmw", 1923);
        if (masina1.isDecapotabila() == false ) {
            throw new RuntimeException();
        }
    }

    @org.junit.Test
    public void eDecapotabila() {
        Registru registru = new Registru();
        List<Car> Decapotabila = registru.filtruDecapotabila();
        Integer lungimea = Decapotabila.size();
        if (lungimea != 3 ) {
            throw new RuntimeException();
        }

        for (int i =0; i < lungimea ; i++) {
            Car decapotabila1 = Decapotabila.get(i);
            if (!decapotabila1.isDecapotabila()) {
                throw new RuntimeException();
            }
        }


    }


    @org.junit.Test
    public void masiniMaiVechi() {
        Registru regi = new Registru();
        List<Car> masiniVechi = regi.masiniMaiVechiDecatX(2003);
        assert masiniVechi.size() == 1;

    }
}
