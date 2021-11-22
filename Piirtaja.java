public class Piirtaja {

    private int vaarin; // Väärien arvausten lukumäärä

    public Piirtaja() {
        this.vaarin = 0;
    }

    public void setVaarin() { // Lisää väärien arvausten lukumäärä yhdellä.
        this.vaarin++;
    }

    public int getVaarin() { // Palauttaa väärien arvausten lukumäärän.
        return this.vaarin;
    }

    public void josVaarin() { // Tulostaa osia hirsipuusta, kun käyttäjä arvaa väärin ja kertoo montako arvausta voi vielä vastata väärin ennen kuin häviää pelin.
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
            System.out.println("( )    |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("----------");
        }

        if (vaarin == 3) {
            System.out.println("Väärä kirjain, sinulla on 4 yritystä jäljellä.");
            System.out.println(" -------");
            System.out.println("  |     |");
            System.out.println(" ( )    |");
            System.out.println("  |     |");
            System.out.println("  |     |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("----------");
        }

        if (vaarin == 4) {
            System.out.println("Väärä kirjain, sinulla on 3 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("  ( )    |");
            System.out.println("  /|     |");
            System.out.println("   |     |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println(" ----------");
        }

        if (vaarin == 5) {
            System.out.println("Väärä kirjain, sinulla on 2 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("  ( )    |");
            System.out.println("  /|\\    |");
            System.out.println("   |     |");
            System.out.println("   |     |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println(" ----------");
        }

        if (vaarin == 6) {
            System.out.println("Väärä kirjain, sinulla on 1 yritys jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("  ( )    |");
            System.out.println("  /|\\    |");
            System.out.println("   |     |");
            System.out.println("  /      |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println(" ----------");
        }

        if (vaarin == 7) {
            System.out.println("  __________");
            System.out.println("   |      |");
            System.out.println("  ( )     |");
            System.out.println("  /|\\     |");
            System.out.println("   |      |");
            System.out.println("  / \\     |");
            System.out.println("          |");
            System.out.println("          |");
            System.out.println("          |");
            System.out.println(" ------------");
            System.out.println("Väärä kirjain, hävisit pelin!");
        }
    }
}



