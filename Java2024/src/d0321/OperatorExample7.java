package d0321;

public class OperatorExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		
		int result1 = a + b;
		//byte result1 = a + b; 
		double result2 = c + d;
		//int result2 = c + d;
		
		//좌항과 우항의 타입이 다르더라고, 좌항보다  우항 큰 타입으론 산출이 가능하다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
