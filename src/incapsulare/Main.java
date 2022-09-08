package incapsulare;

public class Main {
    public static void main(String[] args) {

        ReteaSociala facebook = new ReteaSociala("Scornici", "Ion", 320);
        System.out.println(facebook);
        facebook.setAccPrivat(false);
        facebook.setNrPrieteni(560);
        System.out.println(facebook.toString());

        DatePersonale description = new DatePersonale("Chisinau", 20, "TGM Studio");
        System.out.println(description.toString());
        description.setOrasulNatal("Paris");
        description.setVarsta(22);
        System.out.println(description.toString());
    }
}
