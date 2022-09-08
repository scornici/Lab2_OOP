package mostenireSimpla;

public class ModelVechi {
    private String nume;
    private String procesor;
    private double diagonala;

    public ModelVechi(String nume, String procesor, double diagonala){
        this.nume=nume;
        this.procesor=procesor;
        this.diagonala = diagonala;
    }

    public String getNume() {
        return nume;
    }

    public String getProcesor() {
        return procesor;
    }

    public double getDiagonala() {
        return diagonala;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setDiagonala(double diagonala) {
        this.diagonala = diagonala;
    }

    @Override
    public String toString(){
        return "Macbook{" +
                "nume='" + nume + '\'' +
                ",procesor = '" + procesor + '\'' +
                ",diagonala = " + diagonala +
                ',';
    }
}


