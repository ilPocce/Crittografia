package Algoritmi;

public class Codificatore {

    private int iterazione, indiceChiave;

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

        char scuro;

        if (indiceChiave > AlfabetoFacility.getChiave().size()){
            indiceChiave=1;
        }

        // alfabeto da 1 a 187 caratteri (compresi)
        int valoreRecuperato;
        int valoreAggiornato;

        switch (iterazione){
            case 1:
                valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(chiaro);
                valoreAggiornato = valoreRecuperato + AlfabetoFacility.getChiave().get(indiceChiave-1);
                valoreAggiornato = (valoreAggiornato > 187 ) ? valoreAggiornato -= 187 : valoreAggiornato;
                scuro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
            case 2:
                valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(chiaro);
                valoreAggiornato = valoreRecuperato - AlfabetoFacility.getChiave().get(indiceChiave-1);
                valoreAggiornato = (valoreAggiornato < 1 ) ? valoreAggiornato += 187 : valoreAggiornato;
                scuro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
            default:
                valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(chiaro);
                valoreAggiornato = valoreRecuperato * AlfabetoFacility.getChiave().get(indiceChiave-1);
                while (valoreAggiornato > 187 ) {
                    valoreAggiornato-= 187;
                }
                scuro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
        }

        return scuro;
    }

}
