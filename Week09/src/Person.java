
public class Person {
	//미국의 피트단위
	static final double FEET_CONSTANT = 30.48;
	
	final String nation = "Korea";
	final String ssn;
	String name;
	double height;
	
	public Person(String ssn, String name, double height) {
		this.ssn = ssn;
		this.name = name;
		this.height = height;
	}
}
