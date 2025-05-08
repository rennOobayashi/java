package week10;

public class Car {
	//외부 접근 제한
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//private 변수라서 읽을 수 없는 뱐수 초기화
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String _company) {
		company = _company;
	}
}
