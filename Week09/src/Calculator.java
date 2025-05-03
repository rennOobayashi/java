
public class Calculator {
	static double pi = 3.141592;
	String color;
	String size;
	
	Calculator(String _color, String _size) {
		color = _color;
		size = _size;
	}
	
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");		
	}
	
	static int plus(int x, int y) {
		System.out.println("int");
		return x + y;
	}
	
	double plus(double x, double y) {
		System.out.println("double");
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	int sum1 (int[] values) {
		int sum = 0;
		
		for (int i : values) {
			sum += i;
		}

//		for (int i = 0; i < values.length; ++i) {
//			sum += i;
//		}
		
		return sum;
	}

	int sum2 (int ... values) {
		int sum = 0;
		
//		for (int i : values) {
//			sum += i;
//		}

		for (int i = 0; i < values.length; ++i) {
			sum += values[i];
		}
		
		return sum;
	}
	
	double divide(int x, int y) {
		return (double)x / y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
}
