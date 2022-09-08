package mostenireSimpla;

public class ModelNou extends ModelVechi {
    private boolean faceID = true;
    private String tastatura;
    private boolean hdmi = true;

    public ModelNou(String nume, String procesor, double diagonala, String tastatura){
        super(nume, procesor, diagonala);
        this.tastatura = tastatura;
    }

    public boolean isFaceID() {
        return faceID;
    }

    public String getTastatura() {
        return tastatura;
    }

    public void setFaceID(boolean faceID) {
        this.faceID = faceID;
    }

    public void setTastatura(String tastatura) {
        this.tastatura = tastatura;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public String toString(){
        return super.toString() +
                " faceID='" + faceID + '\'' +
                ", tastatura = '" + tastatura + '\'' +
                ", prezenta HDMI = '" + hdmi + '\'' +
                '}';
    }
}