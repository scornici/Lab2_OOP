package mostenireIerarhica;

public class Tata extends Strabunel {
    private String profesie;
    private boolean predispunereParSur = false;

    public Tata(String profesie, boolean predispunereParSur) {
        super("Scornici", "albastru");
        this.profesie = profesie;
    }

    public String getProfesie() {
        return profesie;
    }

    public boolean isPredispunereParSur() {
        return predispunereParSur;
    }

    public void setProfesie(String profesie) {
        this.profesie = profesie;
    }

    public void setPredispunereParSur(boolean predispunereParSur) {
        this.predispunereParSur = predispunereParSur;
    }

    @Override
    public String toString() {
        return "Tata" + super.toString() +
                " profesie = '" + profesie + '\'' +
                ", predispunere la par sur = '" + predispunereParSur + '\'' +
                '}';
    }
}
