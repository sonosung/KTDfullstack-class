package d0321;

public class IntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		int var2 = 012;	//���� �տ� 0�� ������, 8����
		int var3 = 0xA; //���� �տ� 0x�� ������ 16����
		
		System.out.println(var1);
		System.out.println(var2);	
		System.out.println(var3);
		
		System.out.printf("8���� : 0%o\n", var2); //printf��� method�� ��. �տ� ���ڿ� ������ �Է�, �� �ڿ� ���������ڸ� ����. ������ �Ǵ� �������.
		System.out.printf("16���� : 0x%X\n", var3); //"\n"�� �ٹٲ�.
		System.out.printf("10���� : %d\n", var3);
	}

}
