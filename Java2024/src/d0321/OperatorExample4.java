package d0321;

public class OperatorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 8;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		//int result3 = y + 10;
		//int result4 = --x + 10;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int z = ++x + y++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result1);
		System.out.println(result2);
		//System.out.println(result3);
		//System.out.println(result4);
	}

}
