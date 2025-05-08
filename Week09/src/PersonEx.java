
public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "이인희", 6.1);
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println(p1.height * Person.FEET_CONSTANT + "cm");
	}
}
