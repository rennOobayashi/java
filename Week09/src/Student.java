
public class Student {
	String name;
	int language;
	int english;
	int math;
	
	public Student(String name, int language, int english, int math) {
		this.name = name;
		this.language = language;
		this.english = english;
		this.math = math;
	}
	
	public int getTotal() {
		return language + english + math;
	}
	
	public double getAve() {
		int sum = getTotal();
		return (double)sum / 3;
	}
}
