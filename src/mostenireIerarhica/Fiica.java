package mostenireIerarhica;

public class Fiica extends Strabunel {
    public String metabolism;
    public boolean urechiMari = false;

    Fiica(String culoareOchi, String metabolism) {
        super("Scornici",culoareOchi);
        this.metabolism = metabolism;
    }

    @Override
    public String toString(){
        return "Fiica" + super.toString() +
                " metabolism='" + metabolism + '\'' +
                ", urechi mari = " + urechiMari +
                '}';
    }
}
