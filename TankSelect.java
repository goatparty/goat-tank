import java.util.*;
public class TankSelect {
	LogMng log = new LogMng(true,false);
	Scanner keyboard = new Scanner(System.in);
	private String[] tanks = {"KV-1","IS-2","Sherman","Churchill","Panther","Tiger","Matilda","Patton"}; 
	
	public TankSelect() {
		//TODO:Read all the tanks from the database and put it into an array
		//TODO:Eventually output statistics for each tank
	}
	
	public String Tank() {
		boolean found = false;
		System.out.println("Please enter corresponding key for tank:")
		for(int x = 0;x < tanks.length;x++) {
			System.out.println("\n" + x + ":" + tanks[x]);
		}
		System.out.print("Enter Number:");
		int selection = keyboard.nextInt();
		String finalChoice;
		for(int x = 0;x < tanks.length;x++) {
			if (tanks[x] = selection) {
				finalChoice = tanks[x];
				found = true;
			}
		}
		if (!found) {
			//TODO:Implement a sentinel to validate choice so it never gets here
			LogMng.warning("User Choice Was Not Valid, Setting tank at [0]");
			return tanks[0];
		} 
		
	}
	
	
}
