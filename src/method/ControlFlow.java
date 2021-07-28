package method;

public class ControlFlow {

	public static void main(String[] args) {
		
		//1. 고객 IN
		System.out.println("어서오세요 ! ");
		//2. 메뉴 보여주기
		System.out.println("Display Menu");
		//3. 주문 접수
		System.out.println("상품(code) 입력");
		//4. 상품 제조
		makeCoffee();
		//5. 고객 전달
		System.out.println("Serving");
		//6. 고객 아웃
		System.out.println("안녕히 가세요!");
	}

	private static void makeCoffee() {
		
		System.out.println("커피만드는중...........");
	}

}
