public class Tank {
	private double armorArray[]; 	//array of armor in mm on different areas of the tank TODO:Make Guide
	private double gunSize; 			//gunSize in mm, TODO:See if this is the same as penetrator size
	private double muzzleVelocity;	//TODO: Make method in Maths class to find slowdown in penetrator velocity at certain distance	
	private double reloadTime; 		//(ms)TODO: Add Postive and Negitives buffs to this value based on certain conditions such as fatigue or fear, Probably will be its own class. will be in milliseconds
	private int shellWeight[],shellLenth[],shellDiameter[]; //(mm)These are arrays because if a tank has multiple types of shells tis will cover all the possibilities 
	
	//THIS STARTS TANK PERFORMANCE PARAMETERS
	private double maxSpeed;		//meters per second, will be max speed on flat terrain
	private byte numGears;		//probably wont mean anything ever, just for the hell of it(optional)
	private double rotationSpeed; //speed the tank will be able to traverse in degrees/s
	private int horsePower; 		//Idk if this will do anything
	private int grossWeight;		//Weight in Kilos
	//private double engineReliability; //probably will be based on nationality, TODO: Figure out system for this, until then this is disabled
	
	//THIS STARTS TANK DESCRIPTION PARAMETERS	
	private String shortTankName, fullTankName;	
	private int numCrew;		//probably will upgrade this to # of gunners, drivers etc TODO:UPGRADE TO EACH, this could affectprf
	private int yearIntroduced; //just info
	private char nationality; 	//String for simplicity TODO:Make method that converts this crap to a string
	private String manufacturer;//Its a string cause fuck making char converter shit stuff
	private String designer;		//whatever its fucking optional TODO:make default value John Doe
	private double dimensions[];//X by Y and Z this in meters
	
	/***********************************************************
	*
	*	 TTTTTTTTTT   OOO   DDD      OOO 
	*   	 T       O   O  D  D    O   O: Finish this fucking shit
	*	     T       O   O  D   D   O   O
	*   	 T        OOO   DDDD     OOO
	*
	***********************************************************/		
	
	public Tank() {
			
	}
}	
