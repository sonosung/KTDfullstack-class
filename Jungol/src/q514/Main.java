package q514;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("height = ");  //"print"�ڿ� "ln"�� �����ؼ�, �Է� Ŀ���� ���忭 ���� ��ġ�ϵ���.

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();

		System.out.println("Your height is " + a + "cm.");


	}
}