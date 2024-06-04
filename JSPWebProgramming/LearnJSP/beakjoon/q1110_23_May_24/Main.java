package q1110_23_May_24;

import java.util.Scanner;

public class Main<numbers> {
	private static int insum;
	private static int presum2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int startNumber = sc.nextInt();
		String presum = Integer.toString(startNumber);
		sc.close();

		do {
			if (startNumber > 10) {
				String[] sum = presum.split("");
				String first = sum[0];
				String last = sum[1];

				Integer firstInt = Integer.valueOf(first);
				Integer lastInt = Integer.valueOf(last);

				insum = firstInt + lastInt;
				
				System.out.println(insum);
			} else if (startNumber < 10 || insum < 10) {
				String presum2 = "0" + Integer.toString(startNumber);
//				Integer plusZero = Integer.valueOf(first_1);
				System.out.println(presum2);
			}
		} while (insum != startNumber || presum2 != startNumber);
		if (insum == startNumber || presum2 == startNumber) {

		}
	}

}
