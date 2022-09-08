package mostenireIerarhica;

public class Main {
    public static void main(String[] args) {

        Fiu ion = new Fiu("verde",1.94);
        System.out.println(ion.toString());

        Tata vadim = new Tata("inginer",true);
        System.out.println(vadim.toString());

        Fiica elena = new Fiica("caprui","rapid");
        System.out.println(elena.toString());
    }
}
