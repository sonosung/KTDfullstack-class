package d0321;

public class OperatorEaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
			//������ "(c2 + 1)�� ���� ����ǰ�, Ÿ���� int�̱� ������,
			//�̸� "(char)"�� ����Ͽ� ACSII ĳ���ͷ� �����ϸ�,
			//���Ⱚ 66�� ���� ASCII���ڿ��� �ش��ϴ� �� "B" �� ����.
			
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
