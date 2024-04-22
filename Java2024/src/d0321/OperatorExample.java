package d0321;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 3;
		int y = -4;
		int z = +5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		int result1 = +y;
		int result2 = y;
		int result3 = -y;
		
		System.out.println(result1);	// 음수에 +를 대입해도 음수임
		System.out.println(result2);
		System.out.println(result3);	// 음수에 -를 대입하면 양수가 됨.
	}

}
