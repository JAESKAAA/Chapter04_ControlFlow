package training;

public class Test04 {

	public static void main(String[] args) {
		//자연수 1부터 시작하여 1,000까지 홀수만 더하고, 1,000이 넘을때 까지 몇번의 덧셈이 있는지 출력
		//그리고 1000을 넘어선 값은 얼마인지 ?
		
		int sum=0;
//		for(int i=0; i<1001; i++) {
//			if(i%2!=0) {
//				System.out.println("홀수의 값: "+i);
//				sum+=i;
//			}
//		}
		
		int num=1;
		int index=0;
		while (true) {
			//홀수조건
			if(num%2!=0) {
				System.out.println("홀수의 값: "+num);
				sum+=num;
				System.out.println("총합: "+sum);
			}
			//합이 1000을 넘는 조건
			if(sum>1000) {
				System.out.println(num+"을 더하면 1,000을 넘게됩니다.");

				break;
			}
			num++;
		}
		System.out.println("홀수의 합:"+sum);
		
	}

}
