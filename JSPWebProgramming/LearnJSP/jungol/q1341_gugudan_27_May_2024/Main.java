package q1341_gugudan_27_May_2024;

import java.util.Scanner;

public class Main {

	private static Main gugudan;
	private static int gugudan_1;
	private static int gugudan_2;
	private static int s;
	private static int e;
	private static int i;
	private static int j;
	private static String gugu;
	private static Scanner sc = new Scanner(System.in);

	public Main() {

		int s = sc.nextInt();
		int e = sc.nextInt();

		if(s > e || s < e)
//			for (int s = 0; int )
			
		
		for (int i = 1; i < 10; i++) {
			if (s >= 2 && s <= 9) {
				int gugudan_1 = s * (i);
				
				System.out.print(s + " * " + i + " = ");
				System.out.printf("%2d  ", gugudan_1);

				if (i % 3 == 0) 
					System.out.println("");
			}
		}
		System.out.println("\t");
		for (int j = 1; j < 10; j++) {
			if (e >= 2 && e <= 9) {
				int gugudan_2 = e * (j);
				System.out.print(e + " * " + j + " = ");
				System.out.printf("%2d  ", gugudan_2);
				
				if (j % 3 == 0) 
					System.out.println("");
					
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan = new Main();

	}

}
