package q514;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("height = ");  //"print"뒤에 "ln"을 제거해서, 입력 커서가 문장열 옆에 위치하도록.

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();

		System.out.println("Your height is " + a + "cm.");


	}
}