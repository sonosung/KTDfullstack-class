package d0321;

public class OperatorEaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
			//우항의 "(c2 + 1)이 먼저 산출되고, 타입은 int이기 때문에,
			//이를 "(char)"를 사용하여 ACSII 캐릭터로 산출하면,
			//산출값 66에 대한 ASCII문자열에 해당하는 값 "B" 가 나옴.
			
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
