package d0321;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte var1 = 125;
			byte var2 = 125;
			
			for(int i=0;i<5;i++) {  //for �ݺ���(�ʱ�ȭ��,���ǽ�,������)
				var1++;				//"var1�� 1 ������Ű�ڴ�." var1 = var1 + 1
				var2++;				//"var2�� 1 ������Ű�ڴ�." var1 = var1 + 1
				System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
			}											// "\t"�� ��ȿ��
	}

}
//��������� 3��°�� ������ �Ǵ°�, overflow����(����Ǵ� �� ���� �ۿ� ���� �Էµɶ�)�� �Ͼ�� ����.
//8bit �� ���� �� ��(MSB)�� 1�� �Ǿ� ������ ǥ����.
//������ 2�� ������ ���ϸ� ����.(1�Ǻ��� + 1)
//1�� ������ ���Ҷ�, ��Ʈ�� �����´�. -> ������ ��Ʈ�� 1�� ���Ѵ�.