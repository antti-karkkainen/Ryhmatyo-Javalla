import java.nio.file.Paths;
import java.util.ArrayList;

public class Kayttoliittyma {

    private ArrayList<String> sanat;
    private String sana;
    private Scanner lukija;

    public Kayttoliittyma() {
        this.sanat = new ArrayList<>();
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
    }

    public String randomSana() {
        return this.sanat.get((int) Math.random() * this.sanat.size());
    }

    public void arvaaKirjain() {
        
    }

    public boolean onkoVaarin() {        
        return false;
    }

}
