package mostenireIerarhica;

public class Fiu extends Strabunel {
    private double inaltime;
    private boolean barbaRoscata = true;

    public Fiu(String culoareOchi, double inaltime){
        super("Scornici", culoareOchi);
        this.inaltime = inaltime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public boolean isBarbaRoscata() {
        return barbaRoscata;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setBarbaRoscata(boolean barbaRoscata) {
        this.barbaRoscata = barbaRoscata;
    }

    @Override
    public String toString(){
        return "Fiu" + super.toString() +
                " inaltime = '" + inaltime + '\'' +
                ", barba roscata = '" + barbaRoscata + '\'' +
                '}';
    }
}
