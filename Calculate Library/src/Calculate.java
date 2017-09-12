// Julio Dela Cruz
// September 5 2017
// This is our home grown library that will contain math methods.
public class Calculate {
	
	// This method takes an integer and returns its integer square
	public static int square (int operand) {
		return operand*operand;
	}
	//This method takes an integer and returns its integer cubed
	public static int cube (int operand) {
		return operand*operand*operand;
	}
	//This method takes two doubles and returns their double average
	public static double average (double operand, double operand1) {
		return (operand + operand1)/2;
	}
	//This method takes three doubles and returns their double average
	public static double average (double operand, double operand1, double operand3) {
		return (operand+operand1+operand3)/3;
	}
	//Converts an angle measure given in radians into degrees 
	public static double toDegrees (double operand) {
		return (operand*180/3.14159);
	}
	//This method converts an angle measure given in degrees into radians 
	public static double toRadians (double operand) {
		return (operand*3.14159/180);
	}
	//This method takes three doubles and returns a double
	public static double discriminant (double operand1, double operand2, double operand3) {
		return ((operand2*operand2)-(4.0*operand1*operand3));
	}
	//This method accepts three integers and returns a string
	public static String toImproperFrac (int a, int b, int c) {
		return (((a*c)+b)+ "/"+c);
	}
	//This method converts an improper fraction into a mixed number. It accepts two integers and returns a string.
	public static String toMixedNum (int a, int b) {
		int wholeNum = (a/b);
		int Numerator = (a%b);
		return (wholeNum + "_" + Numerator + "/" + b);
		
	}
	}

			
	


	
	
	
	

	

