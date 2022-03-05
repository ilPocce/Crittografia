package Algoritmi;

public class Codificatore {

    int iterazione, indiceChiave;

    public Codificatore(){
        iterazione = 0;
        indiceChiave = 0;
    }

    public String codifica(String chiaro){
        String scuro = "";

        if (chiaro.length() == 1){
            scuro += codificaCarattere(chiaro.charAt(0));
        } else {
            scuro = codificaCarattere(chiaro.charAt(0)) + codifica(chiaro.substring(1));
        }

        return scuro;
    }

    private char codificaCarattere(char chiaro) {

        iterazione++;
        indiceChiave++;

        if (indiceChiave > AlfabetoFacility.getChiave().size()){
            indiceChiave=1;
        }

        System.out.println(AlfabetoFacility.getChiave().get(indiceChiave-1));

        switch (iterazione){
            case 1:
                //System.out.println(1);
                break;
            case 2:
                //System.out.println(2);
                break;
            case 3:
                //System.out.println(3);
                iterazione = 0;
                break;
        }

        return chiaro;
    }

}
