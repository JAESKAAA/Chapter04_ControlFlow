package ch04_2_for;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WhileScannerPractice {

	/************Chapter 4. 조건문과 반복문 예제 7번************
	 * 
	 * 예제 풀다가 아쉬운 부분을 좀더 보완했음
	 * 
	 * 1. 은행 프로그램이기 떄문에 balance 값이나 withdraw 값을 Long 타입으로 변환하였음
	 * 	-> 최초에 long balance =0; 으로만 입력해서 Long 타입선언이 안되었음 -> 0L로 식별자를 입력해줘야 컴파일러가 long타입으로 인식함
	 * 2. 잔액 출력이 너무 보기 힘들어 찾아보니 DecimalFormat 이용하여 세자릿수 마다 콤마를 출력 할 수 있게 되었음.
	 * 3. 초기 메뉴 선택에서 사용자가 실수로 정수외에 다른 문자 입력할 경우 예외 처리하여 프로그램이 종료되는것 방지함
	 * 4. 출금시 잔액이 입력한 출금액 보다 작을 경우 조건문을 통해 다시 입력하도록 처리함
	 * 
	 */
	
	
	public static void main(String[] args) {

		DecimalFormat formatter = new DecimalFormat("###,###");
		
		Scanner sc = new Scanner(System.in);
		long balance = 0L; 
		int input = 0;
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("입력값을 잘못 입력 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			if(input == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(input) {
				
			case 1 :
				System.out.println("예금액> ");
				balance = sc.nextLong();
				System.out.println("현재 잔고는 "+formatter.format(balance)+" 원 입니다.");
				continue;
			
			case 2:
				System.out.println("출금액> ");
				long withdraw = sc.nextLong();
				if(withdraw <= balance) {
					balance = balance-withdraw;
				} else {
					System.out.println("잔고가 부족합니다. 잔액을 확인해주세요.");
				}
				System.out.println("현재 잔고: "+formatter.format(balance)+" 원.");
				continue;
				
			case 3:
				System.out.println("잔고> ");
				System.out.println("현재 잔고는 "+formatter.format(balance)+" 원 입니다.");
			
			}
			
		}
		
	}

}
