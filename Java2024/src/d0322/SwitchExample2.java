package d0322;

public class SwitchExample2 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		//���� �� �ִ� ������� 8,9,10,11 �� ����!
		System.out.println("����ð� : " + time);

		switch (time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default: //case 8,9,10 �� �ش��ϴ� ���� ������ default�� �ٷ� �Ѿ��.
			System.out.println("�ܱ��� �����ϴ�.");
			//ex)����ð� : 11
			//   �ܱ��� �����ϴ�.
		}
	}
}
// case �Ʒ��� break ����Ʈ�� ������, �� �Ʒ� 