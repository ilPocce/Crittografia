package Algoritmi;

import java.util.HashSet;
import java.util.Set;

public class AlfabetoFacility {


    // inizio parte alfabeto
    private Set<Character> alfabeto = new HashSet<>();
    private Integer random;

    public AlfabetoFacility() {
        inizializzaAlfabeto();
    }

    private void inizializzaAlfabeto() {

        for (int i = 33; i <= 125; i++) {
            alfabeto.add((char)i);
        }

        for (int i = 160; i <= 253; i++) {
            alfabeto.add((char)i);
        }

    }

}
