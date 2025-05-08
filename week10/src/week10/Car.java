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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
