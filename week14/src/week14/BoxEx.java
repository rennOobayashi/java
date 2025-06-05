package week14;

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		String sVal = null;
		
		box.set("Halo");
		sVal = box.get();
		
		System.out.println(sVal);
		
		Box<Integer> box2 = new Box<>();
		int iVal = 0;
		
		box2.set(10);
		iVal = box2.get();
		
		System.out.println(iVal);
	}
}
