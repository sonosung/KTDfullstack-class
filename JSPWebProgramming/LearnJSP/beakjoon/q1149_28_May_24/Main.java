package q1149_28_May_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfHouse = sc.nextInt();
		int[][]	arr = new int[numberOfHouse][3];
		
		for(int i=0;i<numberOfHouse;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
				
//				if()
				System.out.println(arr[i][j]);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < Math.log(numberOfHouse); j++) {
				
//				System.out.println(numberOfHouse);
			}
				
		}
		
	}

}
