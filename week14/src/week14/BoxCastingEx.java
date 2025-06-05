package week14;

public class BoxCastingEx {
	public static void main(String[] args) {
		BoxCasting box = new BoxCasting();
		String sVal = null;
		int iVal = 0;
		box.set("Halo");
		
		sVal = (String)box.get();
		System.out.println(sVal);
		
		box.set(10);
		iVal = (int)box.get();
		
		System.out.println(iVal);
	}
}
