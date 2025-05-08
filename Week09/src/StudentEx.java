
public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student("이인희", 60, 59, 35);
		
		System.out.printf("%s: 총점 %d점, 평균 %.1f점\r\n", stu.name, stu.getTotal(), stu.getAve());
	}
}
