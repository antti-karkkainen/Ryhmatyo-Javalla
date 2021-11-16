import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

import java.util.Random;



public class Kayttoliittymav2 {
    public static void main(String [] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("words.txt"));
    Scanner nappaimisto = new Scanner(System.in);

    List<String> sanat = new ArrayList<>();
    while (scanner.hasNext()) {
    sanat.add(scanner.nextLine());
    }
    Random arpa = new Random();
    String sana = sanat.get(arpa.nextInt(sanat.size()));

    System.out.println(sana);

    List<Character> arvaukset = new ArrayList<>();

    printtaaja(sana, arvaukset);
    
    while(true) {
        pelaajasyote(nappaimisto, sana, arvaukset);

        if (printtaaja(sana, arvaukset)) {
            break;
        }
    }
    System.out.println("Voitit pelin");
}












    private static void pelaajasyote(Scanner nappaimisto, String sana,List<Character> arvaukset) {
    System.out.println("Arvaa kirjain");
    String arvattu = nappaimisto.nextLine();
    arvaukset.add(arvattu.charAt(0));
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
