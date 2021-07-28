package training;

public class Test03 {

	public static void main(String[] args) {

		//100 이하의 자연수 중 2의 배수이면서 7의 배수 값을 출력하고 그 배수의 총합을 출력하기
		int i=1;
		int sum=0;

		while(i<101) {
			if((i%2==0) && (i%7==0)) { //2와 7로 나눈 수가 0일때
				System.out.println("2와 7의 배수: "+i); //i값을 출력해주기
				sum+=i; //sum 변수에 출력된 i값 더해주기
			}
			i++; // 101이하까지 1씩 증가하는 식
		}
		System.out.println("총합: "+sum);
	}

}
