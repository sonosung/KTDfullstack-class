package d0321;

import java.util.Scanner;  //ctrl + shift + o ������ import��.

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner Ŭ����. new Ű����� Heap �� instance�� ����� �ȴ�.
		int a = sc.nextInt();  //".nextInt" => ����ںη��� �Է¹��� ���� integer�� �޾Ƶ��̴� method.
		int c = sc.nextInt();
		double b = sc.nextDouble();
		sc.close();  //��ĳ�� �����ڵ�.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
