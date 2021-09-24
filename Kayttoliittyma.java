import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayttoliittyma {

    private ArrayList<String> sanat;
    private String sana;
    private Scanner lukija;
    private int vaarin;

    public Kayttoliittyma() {
        this.sanat = new ArrayList<>();
        this.sana = randomSana();
        this.vaarin = 0;
    }

    public void kaynnista() {
        System.out.println("-1 lopettaa");
        String syote = lukija.nextLine();
        while (true) {
            if (Integer.valueOf(syote) == -1) {
                break;
            }
        }
    } 

    public void lueTiedosto() {
        try (Scanner lukija = new Scanner(Paths.get("words.txt"))) {

            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                this.sanat.add(rivi);                             
            }

        }  catch (Exception e) {
            System.out.println("Virhe: tiedostoa ei löydy!" + e.getMessage()); 
    }

    public String randomSana() {
        return this.sanat.get((int) Math.random() * this.sanat.size());
    }

    public char arvaaKirjain() {
        System.out.print("Arvaa kirjain: ");
        String arvaus = lukija.nextLine();
        char arvausKirjaimena = arvaus.charAt(0);

        return arvausKirjaimena;
    }

    public boolean onkoOikein() {    
        int i = 0;
        while (i < this.sana.length()) {
            if (this.sana.charAt(i) == (arvaaKirjain())) {
                return true;
            }
            i++;
        }          
        this.vaarin++;
        return false;
    }

    public void josVaarin() {
        if ( vaarin == 1) {
            System.out.println("Väärä kirjain, sinulla on 6 yritystä jäljellä.");
            System.out.println(" -------");
            System.out.println(" |     |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("----------");
        }

        if (vaarin == 2) {
            System.out.println("Väärä kirjain, sinulla on 5 yritystä jäljellä.");
            System.out.println(" -------");
            System.out.println(" |     |");
            System.out.println(" O     |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("----------");
        }

        if (vaarin == 3) {
            System.out.println("Väärä kirjain, sinulla on 4 yritystä jäljellä.");
            System.out.println(" -------");
            System.out.println(" |     |");
            System.out.println(" O     |");
            System.out.println(" |     |");
            System.out.println(" |     |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("----------");
        }

        if (vaarin == 4) {
            System.out.println("Väärä kirjain, sinulla on 3 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("  |     |");
            System.out.println("  O     |");
            System.out.println(" \|     |");
            System.out.println("  |     |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 5) {
            System.out.println("Väärä kirjain, sinulla on 2 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("  |     |");
            System.out.println("  O     |");
            System.out.println(" \|/    |");
            System.out.println("  |     |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 6) {
            System.out.println("Väärä kirjain, sinulla on 1 yritys jäljellä.");
            System.out.println("  -------");
            System.out.println("  |     |");
            System.out.println("  O     |");
            System.out.println(" \|/    |");
            System.out.println("  |     |");
            System.out.println(" /      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 7) {
            System.out.println("Väärä kirjain, hävisit pelin!");
            System.out.println("  -------");
            System.out.println("  |     |");
            System.out.println("  O     |");
            System.out.println(" \|/    |");
            System.out.println("  |     |");
            System.out.println(" / \    |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }
    }
}
