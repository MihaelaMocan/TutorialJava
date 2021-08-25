package Cars;

public abstract class Car {

//7. Clasa abstracta masini cu culoare , marca, an , getter setter to string
    private String culoare;
    private String marca;
    private int an;
    private boolean eDecapotabila;

    @Override
    public String toString() {
        return "Car{" +
                "culoare='" + culoare + '\'' +
                ", marca='" + marca + '\'' +
                ", an=" + an +
                ", eDecapotabila=" + eDecapotabila +
                '}';
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isDecapotabila() {
        return eDecapotabila;
    }

    public void seteDecapotabila(boolean eDecapotabila) {
        this.eDecapotabila = eDecapotabila;
    }

    public Car(String culoare, String marca, int an, boolean eDecapotabila) {
        this.culoare = culoare;
        this.marca = marca;
        this.an = an;
        this.eDecapotabila = eDecapotabila;

    }
}
