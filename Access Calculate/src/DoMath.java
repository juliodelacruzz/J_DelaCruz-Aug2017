// Julio Dela Cruz
// September 5 2017
// This is the runner class for my Calculate methods

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(25.0, 41.7));
		System.out.println(Calculate.average(42.0, 33.9, 12.3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2, 3, 6, -7));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(5.0));
		System.out.println(Calculate.max(25, 13));
		System.out.println(Calculate.min(2,4));
		System.out.println(Calculate.round2(22.567));
		System.out.println(Calculate.exponent(4, 2));
	}

}
