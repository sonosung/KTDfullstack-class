package q10810_03_June_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] bucket = new int[n];
		
		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
//			System.out.println(i + " " + j + " " + k);
			
// 배열 bucket의 i번 바구니부터 j번 바구니까지에 
// k번 번호가 적혀져 있는 공을 넣는다.
			for(int h = i - 1; h <= j - 1; h++) {
				bucket[h] = k;
			}
		}
		sc.close();
		
		for (int h = 0; h < bucket.length; h++) {
			System.out.println(bucket[h] + " ");
		}
		System.out.println();
	}

}
