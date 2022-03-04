import Algoritmi.AlfabetoFacility;
import Algoritmi.Codificatore;
import Algoritmi.Decodificatore;

public class Main {
    public static void main(String[] args) {

        String key = ""+System.currentTimeMillis();


        Codificatore codificatore = new Codificatore(key);
        Decodificatore decodificatore = new Decodificatore(key);

        String chiaro = "Test per vedere se la crittografia funziona bene 1234!@#$";

        // 1- 254 compresi
        /*char test = 50;
        int i = 2;



        int r = 0;

        for (int j = 0; j < 50; j++) {

            System.out.println("prova "+ r);
        }
*/
        AlfabetoFacility alfabetoFacility = new AlfabetoFacility();

        codificatore.codifica(key);

    }
}
