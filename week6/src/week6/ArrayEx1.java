package week6;

public class ArrayEx1 {
	public static void main(String[] args) {
		//Create array from a list of values
		int[] scores = {70, 80, 90, 95, 65};
		String[] pNames = {"Java", "C", "Python", "C#"};
		double[] dArray1;
		dArray1 = new double[] {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
		//Create array using the new operator
		//if no value is specified, the data is automatically
		//initialized to the default value
		int[] iArray = new int[5];
		System.out.println("iArray[3] : " + iArray[3]);
		
		double[] dArray2 = new double[5];
		System.out.println("dArray2[2]: " + dArray2[2]);
		
		String[] sArray = new String[5];
		System.out.println("sArray[1] : " + sArray[1]);
	}
}
