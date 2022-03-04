package Algoritmi;

import java.util.ArrayList;
import java.util.List;

public class Codificatore {

    private final String key;

    private List<Integer> numeri = new ArrayList<>();

    public Codificatore(String key){
        this.key = key;
    }


    public String codifica(String chiaro){
        String scuro = "";

        for (char ch : key.toCharArray()) {
            numeri.add(Integer.getInteger(ch+""));
        }

        System.out.println("key = " + key);
        System.out.println("key splittata = " + numeri);

        return scuro;
    }

}
