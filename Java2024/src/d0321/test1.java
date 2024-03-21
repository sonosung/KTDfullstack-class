package d0321;

import java.util.Scanner;  //ctrl + shift + o 눌러서 import함.

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 클래스. new 키워드는 Heap 에 instance를 만들게 된다.
		int a = sc.nextInt();  //".nextInt" => 사용자부로터 입력받은 값을 integer을 받아들이는 method.
		int c = sc.nextInt();
		double b = sc.nextDouble();
		sc.close();  //스캐너 종료코드.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
