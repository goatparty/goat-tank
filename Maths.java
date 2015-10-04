public class Maths {
	private final double U_CONSTANT = 3400; // STEEL
	public static boolean armorPenetration(double plateThickness,double plateAngle,double penLength,double penMass,double penDiameter,double penVelocity ) 
{
		double cosinePlateAngle = 1/Math.cos(Math.toRadians(plateAngle));
		double cosinePlateAngleToPow = Math.pow(cosinePlateAngle,0.75);
		double diameterPow = Math.pow(penDiameter,3);
		double massDiameter = penMass/diameterPow;
		double diameterLength = penDiameter/penLength;
		double diamLengthPow = Math.pow(diameterLengt,0.3);
		double penVelocitySquare = Math.pow(penVelocity,2.0);
		double u_ConstantSquare = Math.pow(U_CONSTANT,2.0);
		double velocityConstant = penVelocitySquare/u_ConstantSquare;
		
		double part1, part2;
		
		part1 = plateThickness * cosinePlateAngleToPow;
		part2 = massDiameter * diamLengthPow * velocityConstant;
		
		double result = part1 / part2;
		if (result > 1)
			return true;
		else
			return false;
	}
}
