package training;

public class Test {

	public static void main(String[] args) {

//	int n = 24;
//	if(n>=0 && n<10) {
//		System.out.println("0이상 10미만의 수");
//	} else if ( n>=10 && n <20) {
//		System.out.println("10이상 20미만의 수");
//	} else if (n >= 20 && n <30) {
//		System.out.println("20이상 30미만의 수");
//	} else {
//		System.out.println("음수 혹은 30 이상의 수 ");
//	}
	
		int num = (int)(Math.random()*40)+1;
		System.out.println("random값은 = " +num);
		int input = num /10;
		
		switch(input) {
		case 0 : 
			System.out.println("0~10미만의 수");
			break;
		case 1:
			System.out.println("10~20미만의 수");
			break;
		case 2:
			System.out.println("20~30미만의 수");
			break;
		default:
			System.out.println("음수 또는 30 이상의 수");
		}
		
	}

}
