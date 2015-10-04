public class Maths {
	private final double U_CONSTANT = 3400; // STEEL
	
	/**
		
		
		T * (1/cos@)^0.75 = (M/D^3) * (D/L)^0.3 *(v^2/U^2)
		double cosinePlateAngle = 1/Math.cos(Math.toRadians(plateAngle));
		double cosinePlateAngleToPow = Math.pow(cosinePlateAngle,0.75);
		double diameterPow = Math.pow(penDiameter,3);
		double massDiameter = penMass/diameterPow;
		double diameterLength = penDiameter/penLength;
		double diamLengthPow = Math.pow(diameterLengt,0.3);
		double penVelocitySquare = Math.pow(penVelocity,2.0);
		double u_ConstantSquare = Math.pow(U_CONSTANT,2.0);
		double velocityConstant;
		velocityConstant = penVelocitySquare/u_ConstantSquare;
		double part1, part2;
		
		part1 = plateThickness * cosinePlateAngleToPow;
		part2 = massDiameter * diamLengthPow * velocityConstant;
		
		
		T = plate thickness (cm)
		@ = angle 
		u = constant
		L = penetrator length (cm)
		M = penetrator mass (g)
		D = penetrator diameter (cm)
		v = penetrator velocity (m/s)
	*/
	public static boolean armorPenetration(double plateThickness,double plateAngle,double penLength,double penMass,double penDiameter,double penVelocity ) {
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
