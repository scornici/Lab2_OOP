package incapsulare;

public class DatePersonale {
    private String orasulNatal;
    private int varsta;
    private boolean casatorit = false;
    private String lucrulCurent;

    public DatePersonale(String orasulNatal, int varsta, String lucrulCurent){
        this.orasulNatal = orasulNatal;
        this.varsta = varsta;
        this.lucrulCurent = lucrulCurent;
    }

    public String getOrasulNatal() {
        return orasulNatal;
    }

    public void setOrasulNatal(String orasulNatal) {
        this.orasulNatal = orasulNatal;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean isCasatorit() {
        return casatorit;
    }

    public void setCasatorit(boolean casatorit) {
        this.casatorit = casatorit;
    }

    public String getLucrulCurent() {
        return lucrulCurent;
    }

    public void setLucrulCurent(String lucrulCurent) {
        this.lucrulCurent = lucrulCurent;
    }

    @Override
    public String toString(){
        return "Date Personale{" +
                " orasul natal = '" + orasulNatal + '\'' +
                ", varsta = " + varsta +
                ", statut casatorie ='" + casatorit+ '\'' +
                ", lucrul curent = " + lucrulCurent +
                '}';
    }
}