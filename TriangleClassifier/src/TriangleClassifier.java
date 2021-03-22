
public class TriangleClassifier {

	public static boolean isValidTriangle(int a, int b, int c) {
		boolean valid_triangle = false;
		if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
			valid_triangle = true;
		}
		return valid_triangle;
	}
	public static String classifyByAngle(int a, int b, int c) {
		String triangleAngle;
		if (a < 90 && b < 90 && c < 90) {
			triangleAngle = "acute";
		}
		else if (a == 90 || b == 90 || c == 90) {
			triangleAngle = "right";
		}
		else {
			triangleAngle = "obtuse";
		}
		return triangleAngle;
	}

	public static String classifyBySide(int a, int b, int c) {
		String triangleSide;
		if (a == b && b == c) {
			triangleSide = "equilateral";
		}
		else if (a != b && b != c && a != c) {
			triangleSide = "scalene";
		}
		else {
			triangleSide = "isosceles";
		}
		return triangleSide;
	}

	public static String getClassification(int a, int b, int c) {
		boolean validTriangle = isValidTriangle(a, b, c);
		String triangleAngle = classifyByAngle(a, b, c);
		String triangleSide = classifyBySide(a, b, c);
		String invalid = "INVALID";
		if (validTriangle == true) {
			if (triangleSide != "equilateral") {
				return triangleAngle + ' ' + triangleSide;
			}
			else if (triangleSide == "equilateral") {
				return triangleSide;
			}
			else {
				return invalid;
			}
		}
		return invalid;
	}
}