import java.util.ArrayList;


public class Hirsipuu {

    Kayttoliittyma kayttoliittyma = new Kayttoliittyma();

    private String sana;
    
    public Hirsipuu() {
        this.sana = kayttoliittyma.randomSana();
    }

    public void arvaaKirjain(String arvaus) {
        arvaus = arvaus.toUpperCase();
        char arvausKirjaimena = arvaus.charAt(0);
        String alaviivat = this.sana.replaceAll("[A-Z]", "_ "); // Voisikohan alaviivojen piirtämisen toteuttaa näin? Mutta miten vaihtaa arvatun kirjaimen alaviivojen kohdalle...? 
                                                                //Ehkä loop joka tarkkailee sanan indekseissä olevia kirjaimia ja vaihtaa tietyn indeksin kirjaimen viivaksi, jos siinä indeksissä löytyy arvattu kirjain. Eli loop ja if lausekkeita. Kokeilen huomenna.
        
    }

}
