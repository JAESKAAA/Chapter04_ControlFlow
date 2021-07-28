package method;

public class Overloading {

	public static void main(String[] args) {

		
		divOpr(7,3);
		deepDivOpr(8,4);
	}

	public static void divOpr(int i, int j) {
		System.out.println("몫: "+i/j+" 나머지 : "+ i%j);
	}

	public static void deepDivOpr(double i, int j) {
		System.out.println("몫: "+i/j+" 나머지 : "+ i%j);
	}
}
