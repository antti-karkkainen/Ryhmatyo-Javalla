public class Piirtaja {

    private int vaarin;

    public Piirtaja() {
        this.vaarin = 0;
    }

    public void setVaarin() {
        this.vaarin++;
    }

    public int getVaarin() {
        return this.vaarin;
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
            System.out.println("  |     |");
            System.out.println("  O     |");
            System.out.println("  |     |");
            System.out.println("  |     |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("----------");
        }

        if (vaarin == 4) {
            System.out.println("Väärä kirjain, sinulla on 3 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("   O     |");
            System.out.println("\"+|     |");
            System.out.println("   |     |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 5) {
            System.out.println("Väärä kirjain, sinulla on 2 yritystä jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("   O     |");
            System.out.println(" \\|/    |");
            System.out.println("   |     |");
            System.out.println("   |     |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 6) {
            System.out.println("Väärä kirjain, sinulla on 1 yritys jäljellä.");
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("   O     |");
            System.out.println(" \\|/    |");
            System.out.println("   |     |");
            System.out.println("  /      |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
        }

        if (vaarin == 7) {
            System.out.println("  -------");
            System.out.println("   |     |");
            System.out.println("  ( )     |");
            System.out.println(" " +"\" + |/    |");
            System.out.println("   |     |");
            System.out.println("  / \\    |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println("        |");
            System.out.println(" ----------");
            System.out.println("Väärä kirjain, hävisit pelin!");
        }
    }
}



