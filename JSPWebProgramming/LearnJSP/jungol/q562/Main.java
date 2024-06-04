package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			
			if (i % 2 == 1) {
				sum += inp[i];
							
			} else {
				avg += inp[i];
			}
			
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.printf("avg : " + "%.1f", avg/5);
		sc.close();
	}

}
