package d0322;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
//Math Ŭ����!. Math.random �� 0.0�̻�, 1.0 �̸��� ����(������ ����)�� �������·� Return(method return��)��.
		switch(num) {
		//(num) �ڸ��� ���ڰ� �־�����, case�� ������� ������.
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break; //switch �ٱ����� ������ ������ ��.
		case 2:
			System.out.println("2���� ���ӽ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6���� ���Խ��ϴ�.");
			break;
		}
	}

}
