package week6;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] scores = new int[10];
		//누적되는 변수는 반드시 초기화
		int sum = 0;
		float avg = 0.0f;
		
		System.out.println("~Random score(0~99) array~");
		
		//Store a random integer(0~99) at each index
		for(int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 100);
			//System.out.printf("scores[%d]: %d \r\n", i, scores[i]);
		}
		//System.out.println();
		
		//int cnt = 0;
		for(var i : scores) {
			//System.out.printf("scores[%d]: %d", cnt++, i);
			System.out.printf("%d ", i, i);
			sum += i;
		}
		System.out.println();
		System.out.println();

		//avg = sum / cnt;
		avg = (float)sum / scores.length;
		
		System.out.println("Sum     of scores: " + sum);
		System.out.println("Average of scores: " + avg);
		
	}
}
