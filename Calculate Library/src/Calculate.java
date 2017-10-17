// Julio Dela Cruz
// September 5 2017
// This is our home grown library that will contain math methods.
public class Calculate {
	//Part One
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
	//Part Two
	//This method converts a binomial multiplication 
	public static String foil (int a, int b, int c, int d) {
		int first = (a*d);
		int second = (a*d) + (b*c);
		int third = (b*d);
		return (first + "n^2" + "+" + second + "n" + "+" + third);

	}
	//This method determines whether or not one integer is evenly divisible by another. It accepts two integers and returns a boolean
	public static boolean isDivisbleBy (int a, int b) {
		if (a % b == 0) {
			return (true);
		}	else {
			return (false);
		}
	}
	//This method returns the absolute value of the number passed. It accepts a double and returns a double.
	public static double absValue (double a) {
		if (a >= 0) {
			return (a);
		} else {
			return (a * -1);
		}
	}
	// This method returns the larger of the values passed. Accepts two doubles and returns a double.
	public static double max (double a, double b) {
		if (a > b) {
			return (a);
		} else { 
			return (b);
		}
	 
		}
	// this method overloads the the original max method. It accepts three doubles and returns a double.
	public static double max (double a, double b, double c) {
		if (a > b) {
			return (a);
		} else if (b > c && b > a) {
			return (b);	
		} else {
			return (c);
		}
		
	}
	// this method returns the smaller of the values. It accepts two int and returns an int.
	public static int min (int a, int b) {
		if (a < b) {
			return (a);
			
		} else {
			return (b);
		}
		
	}
	//This methods rounds a double correctly to 2 decimal places and returns a double
	public static double round2 (double a) {
		double lastDigit = a * 1000%10;
		if (lastDigit < 5) {
			return((a*1000) - lastDigit)/1000;
		} else {
			return ((a * 1000) - lastDigit + 10)/1000;
		}
		

	}
	//Part Three
	//This method raises a value to a positive integer power.
	public static double exponent(int base, double power){
		double answer = 1.0;
		if(power<0) {
			throw new IllegalArgumentException("Can't take in negative values for exponent");
		}
		if(power == 0){ //anything to the zero power is zero
					return (1);
				}
				for(int i = 1; i <= power; i++){
					answer *= base;
				}
				return(answer);
	}
	//This returns the factorial of the value passed. Takes in an integer and returns an integer
	public static int factorial (int a) {
		int ans = 1;
		if(x<0) { 
			throw new IllegalArgumentException("Can't take in negative values");
		}
	}
	}

		
	
	

		
	
	
	
	

			
	


	
	
	
	

	

