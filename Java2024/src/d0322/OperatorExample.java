package d0322;

public class OperatorExample {

	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long lz1 = (long)x * (long)y; //long�� 8byte. integer�� 4byte
		long lz2 = (long)(x * y);	  //���� ������, (x * y) ���� ���� �����ϰ� ��. iz ó�� overflow�� �߻��ϱ⶧����, ���� iz�� ���� ����.
		//"(long)" : integer ���� long type���� �ٲ㼭 �����ϴ� type casting �̴�
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}
}
