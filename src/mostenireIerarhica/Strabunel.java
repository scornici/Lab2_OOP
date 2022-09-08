package mostenireIerarhica;

public class Strabunel {
    private String numeFamilie;
    private String culoareOchi;

    public Strabunel(String numeFamilie, String culoareOchi) {
        this.numeFamilie = numeFamilie;
        this.culoareOchi = culoareOchi;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public String getCuloareOchi() {
        return culoareOchi;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }

    @Override
    public String toString(){
        return "{" +
                " nume familie = '" + numeFamilie + '\'' +
                ", culoare ochi = '" + culoareOchi + '\'' +
                ',';
    }
}

