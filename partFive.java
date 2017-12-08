
public class partFive {
	public static String quadForm(int a, int b, int c) {
		double disc = discriminant(a, b, c);
		if (disc < 0) {
			return "no real roots";
		} else {
			double root1 = (-b - sqrt(disc)) / (2 * a);
			double root2 = (-b + sqrt(disc)) / (2 * a);
			if (root1 == root2) {
				return "" + round2(root1);
			} else {
				return round2(min(root1, root2)) + " and " + round2(max(root1, root2));
			}
		}
	}

}
