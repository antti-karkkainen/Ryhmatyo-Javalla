import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.stream.events.Characters;
import java.util.Random;

public class Paaohjelma {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("words.txt"));
        Scanner nappaimisto = new Scanner(System.in);
        Piirtaja piirtaja = new Piirtaja();
        List<String> sanat = new ArrayList<>();
        List<Character> arvaukset = new ArrayList<>();

        while (scanner.hasNext()) {
            sanat.add(scanner.nextLine());
        }

        Random arpa = new Random(); // Luodaan random muuttuja
        String sana = sanat.get(arpa.nextInt(sanat.size())); // Luodaan String-muuttuja, jolle annetaan satunnainen arvo sanoista koostuvasta listasta.
        System.out.println(sana); // Printtaa sanan testailua varten.

        //printtaaja(sana, arvaukset);
    
        while(true) {
            String arvaus = pelaajasyote(nappaimisto, sana, arvaukset);
            if (arvaus.equals(sana)) { // Jos koko SANA arvattu suoraan oikein -> Printtaa Voitit, sulkee loopin.
                System.out.println("Voitit pelin");
                break;
            }
            
            if (!loytyykoSanasta(sana, arvaus)) {   // Jos arvattua kirjainta ei löydy sanasta -> printtaa -> lisää piirtaja luokan vaarin-muuttujan arvoa yhdellä.-> tsekkaa mitä pitää piirtää suhteessa väärin-muuttujan arvoon.
                System.out.println("Arvaus väärin!");
                piirtaja.setVaarin();
                piirtaja.josVaarin();
            } else { // Jos arvattu kirjain on oikein, printtaa 
                System.out.println("Oikein!");
            }
            
            if (printtaaja(sana, arvaukset)) {  // Jos kaikki kirjaimet arvattu (Jos arvausten pituus = sanan pituus)
                System.out.println("Arvasit kaikki kirjaimet, Voitit pelin!");
                break;
            }

            if (piirtaja.getVaarin() == 7) { // Jos 7 arvausta väärin, riko looppi,"Hävisit pelin" -viesti tulee Piirtaja-luokasta.
                break;
            }

            /* Vanhaa koodia.
            if(nappaimisto.nextLine().equals(sana)) {
                System.out.println("Voitit pelin");
                break;
            }
            else {
                System.out.println("väärin");
                piirtaja.setVaarin();            
            }
            */
        }
        //System.out.println("Voitit pelin");
    }

    private static boolean loytyykoSanasta(String sana, String arvaus) {  // Jos arvauksen eka kirjain löytyy sanasta, palauta true.
        for (int i = 0; i < sana.length(); i++) {      
            char a = sana.charAt(i);
            char b = arvaus.charAt(0);

            if (b == a) { 
                return true;
            }
        }        
        return false;
    }

    private static String pelaajasyote(Scanner nappaimisto, String sana,List<Character> arvaukset) { // Lisää arvattu kirjain listaan ja palauta arvaus merkkijonona.
        System.out.println("Arvaa kirjain");
        String arvattu = nappaimisto.nextLine();
        arvaukset.add(arvattu.charAt(0));

        return arvattu;
    }

    private static boolean printtaaja(String sana, List<Character> arvaukset) {  
        int montaoikein = 0;
        for (int i = 0; i < sana.length(); i++) {
            if (arvaukset.contains(sana.charAt(i))) {
                System.out.print(sana.charAt(i));
                montaoikein++;
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();
        return (sana.length() == montaoikein);
    }
}