package week14;

public class PrintClass2Ex {

	public static void main(String[] args) {
		PrintClass2<Integer> ipc = new PrintClass2<Integer>();
		ipc.printValue(1);
		
		PrintClass2<String> spc = new PrintClass2<>();
		spc.printValue("Nayutan");
		
		PrintClass2<Boolean> bpc = new PrintClass2<>();
		bpc.printValue(true);
		
	}

}
