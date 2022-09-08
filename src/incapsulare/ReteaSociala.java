package incapsulare;

public class ReteaSociala {
    private String nume;
    private String prenume;
    private int nrPrieteni;
    private boolean accPrivat = true;

    public ReteaSociala(String nume, String prenume, int nrPrieteni){
        this.nume = nume;
        this.prenume = prenume;
        this.nrPrieteni = nrPrieteni;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getNrPrieteni() {
        return nrPrieteni;
    }

    public void setNrPrieteni(int nrPrieteni) {
        this.nrPrieteni = nrPrieteni;
    }

    public boolean getAccPrivat() {
        return accPrivat;
    }

    public void setAccPrivat(boolean accPrivat) {
        this.accPrivat = accPrivat;
    }

    @Override
    public String toString(){
        return "Facebook{" +
                " nume='" + nume + '\'' +
                ", prenume = '" + prenume + '\'' +
                ", numar prieteni = " + nrPrieteni +
                ", profil privat = '" + accPrivat + '\'' +
                '}';
    }
}
