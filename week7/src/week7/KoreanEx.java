package week7;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("이인희", "050725-3111111", "010-1234-5678");
		
		System.out.println("k1.Nation   : " + k1.nation);
		System.out.println("k1.Name     : " + k1.name);
		System.out.println("k1.My number: " + k1.ssn);
		System.out.println("k1.Phone    : " + k1.phone);
	}
}
