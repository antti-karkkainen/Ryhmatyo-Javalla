import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.stream.events.Characters;
import java.util.Random;

public class Käyttöliittymäv2 {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("words.txt"));
        Scanner nappaimisto = new Scanner(System.in);
        Piirtaja piirtaja = new Piirtaja();
        List<String> sanat = new ArrayList<>();
        List<Character> arvaukset = new ArrayList<>();

        while (scanner.hasNext()) {
            sanat.add(scanner.nextLine());
        }

        Random arpa = new Random();
        String sana = sanat.get(arpa.nextInt(sanat.size()));
        System.out.println(sana);

        //printtaaja(sana, arvaukset);
    
        while(true) {
            String arvaus = pelaajasyote(nappaimisto, sana, arvaukset);
            if (arvaus.equals(sana)) { // Jos koko SANA arvattu suoraan oikein -> Printtaa Voitit, sulkee loopin.
                System.out.println("Voitit pelin");
                break;
            }
            
            if (!loytyykoSanasta(sana, arvaus)) {
                System.out.println("Arvaus väärin!");
                piirtaja.setVaarin();
                piirtaja.josVaarin();
            } else {
                System.out.println("Oikein!");
            }
        
            //(!loytyykoSanasta(sana, arvaukset)
            
            if (printtaaja(sana, arvaukset)) {
                break;
            }

            if (piirtaja.getVaarin() == 7) {
                break;
            }

            /*
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

    private static boolean loytyykoSanasta(String sana, String arvaus) {       // Jos arvauksen eka kirjain löytyy sanasta, palauta true.
        for (int i = 0; i < sana.length(); i++) {      
            char a = sana.charAt(i);
            char b = arvaus.charAt(0);

            if (b == a) { 
                return true;
            }
        }        
        return false;
    }

    private static String pelaajasyote(Scanner nappaimisto, String sana,List<Character> arvaukset) {
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