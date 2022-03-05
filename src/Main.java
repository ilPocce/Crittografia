import Algoritmi.AlfabetoFacility;
import Algoritmi.Codificatore;

public class Main {
    public static void main(String[] args) {

        AlfabetoFacility alfabetoFacility = AlfabetoFacility.getInstance();


        Codificatore codificatore = new Codificatore();
        //Decodificatore decodificatore = new Decodificatore(key);

        String chiaro = "Test_per_vedere-se-la-crittografia-funziona-bene-1234!@#$";


        String codificata = codificatore.codifica(chiaro);
        System.out.println(codificata);
    }
}
