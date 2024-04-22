package d0321;

public class IntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		int var2 = 012;	//정수 앞에 0을 넣으면, 8진수
		int var3 = 0xA; //정수 앞에 0x를 넣으면 16진수
		
		System.out.println(var1);
		System.out.println(var2);	
		System.out.println(var3);
		
		System.out.printf("8진수 : 0%o\n", var2); //printf라는 method를 씀. 앞에 문자열 형식을 입력, 그 뒤에 형식지정자를 적음. 변수값 또는 상수값을.
		System.out.printf("16진수 : 0x%X\n", var3); //"\n"은 줄바꿈.
		System.out.printf("10진수 : %d\n", var3);
	}

}
