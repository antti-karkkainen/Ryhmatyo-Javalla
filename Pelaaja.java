

public class Pelaaja {

    private String nimi;
    // private int pisteet; <- jos halutaan tehdä joku pistesysteemi

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        //this.pisteet = 0;
    }

    public String getNimi() {
        return this.nimi;
    }

    /*
    public String lisaaPiste() {
        this.pisteet++;
    }
    */
}
