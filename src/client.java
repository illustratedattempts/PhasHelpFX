import java.util.Scanner;

public class client {
	/*
	 * REMOVAL LIST:
	 * Fingerprints - Phantom, Mare, Yurei, Demon, Jinn, Oni, Shade, Poltergeist, Revenant
	 * Freezing Temperatures - Jinn, Oni, Shade, Spirit, Poltergeist, Revenant
	 * Spirit Box - Phantom, Banshee, Yurei, Shade, Revenant
	 * EMF Level 5 - Wraith, Mare, Yurei, Demon, Spirit, Poltergeist
	 * Ghost Orbs - Wraith, Banshee, Demon, Oni, Revenant
	 * Ghost Writing - Wraith, Phantom, Banshee, Mare, Jinn, Poltergeist
	 */
	/*
	String[] Wraith = {"Fingerprints", "Freezing Temperatures", "Spirit Box"};
	String[] Phantom = {"Freezing Temperatures", "EMF 5", "Ghost Orbs"};
	String[] Banshee = new String[]{"Freezing Temperatures", "EMF 5", "Fingerprints"};
	String[] Mare = new String[]{"Freezing Temperatures", "Ghost Orbs", "Spirit Box"};
	String[] Yurei = new String[]{"Freezing Temperatures", "Ghost Orbs", "Ghost Writing"};
	String[] Demon = new String[]{"Freezing Temperatures", "Spirit Box", "Ghost Writing"};
	String[] Jinn = new String[]{"EMF Level 5", "Ghost Orbs", "Spirit Box"};
	String[] Oni = new String[]{"EMF Level 5", "Ghost Writing", "Spirit Box"};
	String[] Shade = new String[]{"EMF Level 5","Ghost Orbs", "Ghost Writing"};
	String[] Spirit = new String[]{"Fingersprints", "Ghost Orb", "Spirit Box"};
	String[] Poltergeist = new String[]{"Fingersprints", "Ghost Writing", "Spirit Box"};
	String[] Revenant = new String[]{"EMF Level 5", "Fingerprints", "Ghost Writing"};
	
	String[][] evidence_database = {{"Fingerprints", "Freezing Temperatures", "Spirit Box"}, {"Freezing Temperatures", "EMF 5", "Fingerprints"}, {"Freezing Temperatures", "EMF 5", "Fingerprints"}, {"Freezing Temperatures", "Ghost Orbs", "Spirit Box"},
			{"Freezing Temperatures", "Ghost Orbs", "Ghost Writing"}, {"Freezing Temperatures", "Spirit Box", "Ghost Writing"}, {"EMF Level 5", "Ghost Orbs", "Spirit Box"}, {"EMF Level 5", "Ghost Writing", "Spirit Box"}, {"EMF Level 5","Ghost Orbs", "Ghost Writing"},
			{"Fingersprints", "Ghost Orbs", "Ghost Writing"}, {"Fingersprints", "Ghost Orbs", "Spirit Box"}, {"EMF Level 5", "Fingerprints", "Ghost Writing"}};
	*/
	private static String[] ghost_database = {"Wraith", "Phantom", "Banshee", "Mare", "Yurei", "Demon", "Jinn", "Oni", "Shade", "Spirit", "Poltergeist", "Revenant"};
	private static String[] removed_ghosts = new String[12];
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("CHOOSE THE EVIDENCE: Fingerprinters, Freezing Temperatures, Spirit Box, EMF Level 5, Ghost Writing, Ghost Orbs");
		while(true) {
			//Displays the current ghost
			System.out.println("GHOSTS BELOW:");
			for(String container: ghost_database) {
				if(container != null) {
					System.out.print(container + " ");
				}
			}
			System.out.println();
			String evidence = keyboard.nextLine();
			switch(evidence) {
				case "Fingerprints": 
					ghost_database = DELETE_GHOST(ghost_database, "Phantom", "Mare", "Yurei", "Demon", "Jinn", "Oni", "Shade");
					break;
				case "Freezing Temperatures":
					ghost_database = DELETE_GHOST(ghost_database, "Jinn", "Oni", "Shade", "Spirit", "Poltergeist", "Revenant");
					break;
				case "Spirit Box":
					ghost_database = DELETE_GHOST(ghost_database, "Phantom", "Banshee", "Yurei", "Shade", "Revenant");
					break;
				case "EMF Level 5":
					ghost_database = DELETE_GHOST(ghost_database, "Wraith", "Mare", "Yurei", "Demon", "Spirit", "Poltergeist");
					break;
				case "Ghost Orbs":
					ghost_database = DELETE_GHOST(ghost_database, "Wraith", "Banshee", "Demon", "Oni", "Revenant", "Spirit");
					break;
				case "Ghost Writing":
					ghost_database = DELETE_GHOST(ghost_database, "Wraith", "Phantom", "Banshee", "Mare", "Jinn", "Poltergeist");
					break;
			}
		}
	}
	
	public static boolean CHECK_ONE(String[] db) {
		int contains = 0;
		for(String container: db) {
			if(container != null) {
				contains++;
			}
		}
		if(contains > 1) {
			return false;
		}
		return true;
	}
	
	public static String[] DELETE_GHOST(String[] db, String... ghost) {
		for(int i = 0; i < ghost.length; i++) {
			switch(ghost[i]) {
				case "Wraith": 
					db[0] = null;
					removed_ghosts[0] = "Wraith";
					break;
				case "Phantom":
					db[1] = null;
					removed_ghosts[1] = "Phantom";
					break;
				case "Banshee":
					db[2] = null;
					removed_ghosts[2] = "Banshee";
					break;
				case "Mare": 
					db[3] = null;
					removed_ghosts[3] = "Mare";
					break;
				case "Yurei":
					db[4] = null;
					removed_ghosts[4] = "Yurei";
					break;
				case "Demon":
					db[5] = null;
					removed_ghosts[5] = "Demon";
					break;
				case "Jinn":
					db[6] = null;
					removed_ghosts[6] = "Jinn";
					break;
				case "Oni":
					db[7] = null;
					removed_ghosts[7] = "Oni";
					break;
				case "Shade":
					db[8] = null;
					removed_ghosts[8] = "Shade";
					break;
				case "Spirit":
					db[9] = null;
					removed_ghosts[9] = "Spirit";
					break;
				case "Poltergeist":
					db[10] = null;
					removed_ghosts[10] = "Poltergeist";
					break;
				case "Revenant":
					db[11] = null;
					removed_ghosts[11] = "Revenant";
					break;
			}
		}
		return db;
	}
	
	public static String[] RETURN_GHOST(String[] db, String... ghost) {
		for(int i = 0; i < ghost.length; i++) {
			switch(ghost[i]) {
				case "Wraith": 
					db[0] = removed_ghosts[0];
					removed_ghosts[0] = null;
					break;
				case "Phantom":
					db[1] = removed_ghosts[1];
					removed_ghosts[1] = null;
					break;
				case "Banshee":
					db[2] = removed_ghosts[2];
					removed_ghosts[2] = null;
					break;
				case "Mare": 
					db[3] = removed_ghosts[3];
					removed_ghosts[3] = null;
					break;
				case "Yurei":
					db[4] = removed_ghosts[4];
					removed_ghosts[4] = null;
					break;
				case "Demon":
					db[5] = removed_ghosts[5];
					removed_ghosts[5] = null;
					break;
				case "Jinn":
					db[6] = removed_ghosts[6];
					removed_ghosts[6] = null;
					break;
				case "Oni":
					db[7] = removed_ghosts[7];
					break;
				case "Shade":
					db[8] = removed_ghosts[8];
					break;
				case "Spirit":
					db[9] = removed_ghosts[9];
					break;
				case "Poltergeist":
					db[10] = removed_ghosts[10];
					break;
				case "Revenant":
					db[11] = removed_ghosts[11];
					break;
			}
		}
		return db;
	}
}
