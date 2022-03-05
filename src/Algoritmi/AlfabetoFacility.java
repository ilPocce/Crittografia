package Algoritmi;

import java.util.*;

public class AlfabetoFacility {

    private static AlfabetoFacility instance = null;

    private static final List<Character> alfabeto = new ArrayList<>();
    private static final List<Integer> chiave = new ArrayList<>();

    // Costruttore invisibile
    private AlfabetoFacility() {
        inizializzaAlfabeto();
        inizializzaChiave(""+System.currentTimeMillis());

        System.out.println("alfabeto: "+alfabeto);
        System.out.println("chiave: "+chiave);
    }

    public static AlfabetoFacility getInstance() {
        if (instance == null) {
            instance = new AlfabetoFacility();
        }
        return instance;
    }

    private static void inizializzaChiave(String chiaveInput) {
        for (char c : chiaveInput.toCharArray()){
            chiave.add(Integer.valueOf(""+c));
        }
    }

    private static void inizializzaAlfabeto() {

        for (int i = 33; i <= 125; i++) {
            alfabeto.add((char)i);
        }

        for (int i = 160; i <= 253; i++) {
            alfabeto.add((char)i);
        }

    }


    public static List<Character> getAlfabeto() {
        return alfabeto;
    }

    public static List<Integer> getChiave() {
        return chiave;
    }

}
