package q129;

import java.util.Scanner;

//Q: 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고,
//"Continue? "에서 하나의 문자를 입력받아 
//그 문자가 'Y' 나 'y' 이면 작업을 반복하고 
//다른 문자이면 종료하는 프로그램을 작성하시오.
//(넓이는 반올림하여 소수 첫째자리까지 출력한다.)
//​
//예제 : 
//	Base = 11
//	Height = 5
//	Triangle width = 27.5
//	Continue? Y
//	Base = 10
//	Height = 10
//	Triangle width = 50.0
//	Continue? N
//힌트 : 
//	문자를 입력받을 때에는 %c 앞에 공백을 넣어 주어야, 
//	엔터, 공백과 같은 구분자를 입력받지 않고 한 개의 문자를 입력받을 수 있다. 
//	예 : scanf(" %c", &문자변수);
//	
//	위의 입출력예에서 아래 굵은 글씨부분만 출력하면 된다.
//	Base = 11
//	Height = 5
//	Triangle width = 27.5
//	Continue? Y
//	Base = 10
//	Height = 10
//	Triangle width = 50.0
//	Continue? N​ 
//
// 	결과적으로 (제출시)
//	Base = Height = Triangle width = 27.5
//	Continue? Base = Height = Triangle width = 50.0
//	Continue?
//	이와같이 출력된다.​ 

//public class main {
//	public static double area() {
//		
//		double ret = base * height /2;
//		
//		return 0.0;
//	}
//		
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String xory = sc.next(); 
//		
//		int bottom = sc.nextInt();
//		int height = sc.nextInt();
//		
//		double tri_area = (bottom*height)/2;
//		
//			System.out.println(tri_area);
//
//		sc.close();
//	}
//
//}

//선생님께 요청드린 풀이

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s, e;
		do {
			s = sc.nextInt();
			e = sc.nextInt();

			if ((2 <= s && s <= 9) && (2 <= e && e <= 9))
				break;
			System.out.println("INPUT ERROR!");
		} while (true);

		sc.close();

		System.out.println(s + " " + e);

		if (s < e) {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i <= e; i++) {
					System.out.printf("%d * %d = %2d   ", i, j, (i * j));
				}
				System.out.println();
			}
		} else {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i >= e; i--) {
					System.out.printf("%d * %d = %2d   ", i, j, (i * j));
				}
				System.out.println();
			}
		}
	}
}
