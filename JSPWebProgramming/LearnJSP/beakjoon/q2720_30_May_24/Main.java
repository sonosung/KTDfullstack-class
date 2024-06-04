package q2720_30_May_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		int numOfqut;
		int numOfdi;
		int numOfnick;
		int numOfpe;
		int change;

		for (int i = 0; i < test; i++) {
			int money = sc.nextInt();
//			System.out.println(money);

			for (;;) {
				numOfqut = money / quarter;
				numOfdi = (money - (quarter * numOfqut)) / dime;
				numOfnick = ((money - (quarter * numOfqut))-(dime * numOfdi)) / nickel;
				numOfpe = ((money - (quarter * numOfqut))-(dime * numOfdi));
				if (quarter < money && numOfqut < dime && numOfnick < penny) {
					System.out.println(numOfqut);
					System.out.println(numOfdi);
//					System.out.println(money - (quarter * numOfqut));
//					System.out.println((dime * numOfdi));
//					System.out.println(((money - (quarter * numOfqut))-(dime * numOfdi)));
					System.out.println(numOfnick);
				} 
				if (numOfpe > 0){
					System.out.println(numOfpe);
					

					
				}
				break;
			}
		}
	}
}
