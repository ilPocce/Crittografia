import Algoritmi.AlfabetoFacility;
import Algoritmi.Codificatore;
import Algoritmi.Decodificatore;

public class Main {
    public static void main(String[] args) {

        AlfabetoFacility alfabetoFacility = AlfabetoFacility.getInstance();


        Codificatore codificatore = new Codificatore();
        Decodificatore decodificatore = new Decodificatore();

        String chiaro = "Test_per_vedere-se-la-crittografia-funziona-bene-1234!@#$";

        System.out.println(chiaro);
        String codificata = codificatore.codifica(chiaro);
        String decodificata = decodificatore.decodifica(codificata);
        System.out.println(codificata);
        System.out.println(decodificata);
    }
}
