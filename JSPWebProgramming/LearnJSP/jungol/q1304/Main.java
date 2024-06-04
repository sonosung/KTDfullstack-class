package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int surface = n * n;
		int numbers = 0;

		for (int i = 1; i <= surface; i++) {
			numbers += i + n;
			System.out.print(numbers + " ");
			if(numbers > n*i) {
//				System.out.println();
				
			}
		
		}

	}

}
