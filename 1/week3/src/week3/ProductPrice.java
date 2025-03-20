package week3;

public class ProductPrice {

	public static void main(String[] args) {
		int   milk_price   = 4500;
		int   milk_num     = 1;
		int   carrot_num   = 3;
		int   snack_num    = 2;
		int   carrot_price = 1000;
		int   snack_price  = 1500;
		int   pre_total_price;
		float sale_price;
		float total_price;
		
		pre_total_price = milk_price * milk_num + carrot_price * carrot_num + snack_price * snack_num;
		System.out.printf("할인 전 상품 가격: %d원\r\n", pre_total_price);
		
		sale_price = pre_total_price * 0.1f;
		System.out.printf("할인 금액: %.1f원\r\n", sale_price);
		
		total_price = pre_total_price - sale_price;
		System.out.printf("최종 결제 금액: %.1f원\r\n", total_price);
	}

}
