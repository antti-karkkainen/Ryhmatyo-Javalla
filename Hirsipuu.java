import java.util.ArrayList;


public class Hirsipuu {

    Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
    private int vaarin;

    private String sana;
    
    public Hirsipuu() {
        this.sana = kayttoliittyma.randomSana().toUpperCase();
        this.vaarin = 0;
    }

    public void arvaaKirjain(String arvaus) {
        arvaus = arvaus.toUpperCase();
        char arvausKirjaimena = arvaus.charAt(0);
        String alaviivat = this.sana.replaceAll("[A-Z]", "_ ");
                                                                
        //System.out.println(alaviivat);

        if (arvaus.equals(this.sana)) {
            System.out.println("Arvasit sanan oikein!");
        }

        int i = 0;
        while (i < this.sana.length()) {
            if (this.sana.charAt(i) == (arvausKirjaimena)) {
                 
            } else {
                this.vaarin++;
            }

            i++;
        }
    }

    public int getVaarat() {
        return this.vaarin;
    }

}
