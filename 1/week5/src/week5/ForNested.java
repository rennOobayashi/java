package week5;

public class ForNested {
	public static void main(String[] args) {
		for (int x = 0; x < 3; ++x) {
			for (int y = 0; y < 3; ++y) {
				System.out.printf("x: %d, y: %d\r\n", x, y);
			}
		}
	}
}
