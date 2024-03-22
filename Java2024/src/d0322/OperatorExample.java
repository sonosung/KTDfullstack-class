package d0322;

public class OperatorExample {

	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long lz1 = (long)x * (long)y; //long은 8byte. integer는 4byte
		long lz2 = (long)(x * y);	  //산출 순서는, (x * y) 값을 먼저 산출하게 됨. iz 처럼 overflow가 발생하기때문에, 값이 iz와 같게 나옴.
		//"(long)" : integer 값을 long type으로 바꿔서 대입하는 type casting 이다
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}
}
