package d0322;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		
		//data type�� ���� �޶����� ���� �켱������ ���� ������� ����. 
		String str5 = "JDK" + 3 + 3.0; 
		//���׿� String type "JDK"�� integer type "3" �� ���� ����Ǿ�, 
		//��Ʈ��Ÿ������ ����Ǿ��� ������, �ڿ� ����Ǵ� double type "3.0"��
		//���ڿ��� �νĵǾ�, "JDK33.0"�� ��µȴ�.
		String str6 = 3 + 3.0 + "JDK"; //
		//���׿� ���� �վ� �Էµ� integer, double type�� ���� double type���� ����Ǿ�,
		//6.0�̶� double data ���� ����ǰ�, �� �ڿ� "JDK"�� String type �̹Ƿ�,
		//���������� String type���� ����Ǿ� ����ȴ�,
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

}
