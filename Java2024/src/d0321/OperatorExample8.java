package d0321;

public class OperatorExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 : " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 : " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 : " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 : " + result5);
		
		double result6 = (double) v1 / v2;			//"좌항에 "(double)"를 붙여서 실수 값으로 변환하였음.타입캐스팅
		System.out.println("result6 : " + result6);
		
		double result7 = v1 / v2;
		System.out.println("result7 :" + result7); //좌항에 계산된 "2"라는 값을 double형으로 변환하여, 소숫점이 붙어서 나온다. 
	}

}
