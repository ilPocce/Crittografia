package Algoritmi;

public class Decodificatore {

    private int iterazione, indiceChiave;

    public Decodificatore(){
        iterazione = 0;
        indiceChiave = 0;
    }

    public String decodifica(String scruro){
        String chiaro = "";

        if (scruro.length() == 1){
            chiaro += decodificaCarattere(scruro.charAt(0));
        } else {
            chiaro = decodificaCarattere(scruro.charAt(0)) + decodifica(scruro.substring(1));
        }

        return chiaro;
    }

    private char decodificaCarattere(char scuro) {
        iterazione++;
        indiceChiave++;

        char chiaro;

        if (indiceChiave > AlfabetoFacility.getChiave().size()){
            indiceChiave=1;
        }

        // alfabeto da 1 a 187 caratteri (compresi)
        int valoreRecuperato;
        int valoreAggiornato;

        switch (iterazione){
            case 1:
                valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(scuro);
                valoreAggiornato = valoreRecuperato - AlfabetoFacility.getChiave().get(indiceChiave-1);
                valoreAggiornato = (valoreAggiornato < 1 ) ? valoreAggiornato += 187 : valoreAggiornato;
                chiaro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
            case 2:
                valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(scuro);
                valoreAggiornato = valoreRecuperato + AlfabetoFacility.getChiave().get(indiceChiave-1);
                valoreAggiornato = (valoreAggiornato > 187 ) ? valoreAggiornato -= 187 : valoreAggiornato;
                chiaro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
            default:
                // TODO: 05/03/2022 Da capire come fare il contrario
                //valoreRecuperato = AlfabetoFacility.getAlfabeto().indexOf(scuro);
                //valoreAggiornato = valoreRecuperato * AlfabetoFacility.getChiave().get(indiceChiave-1);
                //while (valoreAggiornato > 187 ) {
                //    valoreAggiornato-= 187;
                //}
                //chiaro = AlfabetoFacility.getAlfabeto().get(valoreAggiornato);
                chiaro = '+';
        }

        return chiaro;
    }

}
