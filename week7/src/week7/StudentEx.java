package week7;

//Execution class
public class StudentEx {

	public static void main(String[] args) {
		//라이브러리 클래스 통해 객체 생성
		Student st1 = new Student();
		
		System.out.println("st1 변수는 Student객체 참조");
		
		//라이브러리 클래스 이용해 인스턴스 여러개 생성 가능
		Student st2 = new Student();
		System.out.println("st2 변수는 또다른 Student객체 참조");
	}

}
