
public class TriangleClassifier {

	public static boolean isValidTriangle(int a, int b, int c) {
		boolean valid_triangle = false;
		if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
			valid_triangle = true;
		}
		return valid_triangle;
	}
}
