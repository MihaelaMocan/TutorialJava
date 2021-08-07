package Encapsularea;

public class Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private String cnp;



    // Ca sa poata fie accesat o variabila privata se construisc gettere si settere

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }
    public String getCnp() {
        return cnp;
    }

    public void setNume(String nume) {
        this.nume=nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta=varsta;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }


    public Persoana(String nume, String prenume, int varsta, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.cnp = cnp;



    }



}
