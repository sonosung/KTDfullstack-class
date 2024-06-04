package q18870_23_April_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		//System.out.println(N);
		
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			//System.out.println(X[i] + " ");
		}
		sc.close();
			do {
			
			for(int i = 0; i < X.length; i++) {
				for(int j = 0; j < N; j++ ) {
				//System.out.print(X[i] + " ");
				int[][] doub = new int[i][j];
				System.out.print(doub[i][j] + " ");
				}
			}
			
					
				
				
			}	while (N -1 != 0); {
		}
		
	}
	
}

