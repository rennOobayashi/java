package week2;

public class ProduckPrice {
	public static void main(String[] args) {
		int num        = 7;
		int totalPrice = 5700;
		double price = (double)totalPrice / num;
		
		System.out.printf("구매 수량: %d개 \r\n", num);
		System.out.printf("총 구매 금액: %d원 \r\n", totalPrice);
		System.out.printf("상품 단가: %.1f원 \r\n", price);
	}
}
