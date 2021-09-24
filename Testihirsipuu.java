public class Testihirsipuu {
    
    public int vaarin = 0; 

    out.append("The word: ");
                for (int i = 0; i < word.length(); ++i) {
                    if (visible[i]) {
                        out.print(word.charAt(i));
                    } else {
                        out.print("?");
                    }
                }
                out.append("\n\n");

    public static void alaviiva(String arvaus) {
		String alaviiva = "";
		for (int i = 0; i < sana.length(); i++) {
			if (sana.charAt(i) == arvaus.charAt(0)) {
				alaviiva += arvaus.charAt(0);
			} else if (alaviiva.charAt(i) != '_') {
				uusiAlaviiva += sana.charAt(i);
			} else {
				uusiAlaviiva += "_";
			}
		}

    public void vaaraSana() {
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
