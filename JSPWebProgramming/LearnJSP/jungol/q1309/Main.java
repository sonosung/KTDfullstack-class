package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		int factorial = sc.nextInt();

		for (n = factorial; n > 0; n--) {
			factorial += n * (n - 1);

			if (factorial > 0 && (n - 1) != 0) {
				System.out.println(n + "! = " + n + " * " + (n - 1) + "!");
			}
			if (n - 1 == 0) {
				System.out.println(n + "! = " + n);
			}
			if (factorial == 0) {
				System.out.println("1!");
			} else {
				System.out.println(factorial);
			}
		}
		sc.close();
asdf
	}

}
