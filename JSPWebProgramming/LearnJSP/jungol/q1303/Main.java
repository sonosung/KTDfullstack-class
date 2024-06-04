package q1303;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;

//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		Scanner sc = new Scanner(System.in);
//		String n = sc.next();
//		String m = sc.next();
//		
//		int width = Integer.parseInt(n);
//		int height = Integer.parseInt(m);
//		int num = width * height;
//		int[] arr = new int[num];
//		int rectangle = Integer.parseInt(br.readLine());
//		
////		for (int i = 0; i < width; i++) {
////			arr[i] = Integer.parseInt(br.readLine());
////		}
////		Arrays.sort(arr);
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int j = 0; j < width; j++) {
//			System.out.print(j);
//			if(j % width == 0) {
//				System.out.println("");
//			}
//			
//				
//			
//		}
//		System.out.print(sb);
//		sc.close();
//	}
//
//}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		System.out.println(n + " " + m);

		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
		
	//진규 풀이
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int m = sc.nextInt();
//      
//      
//
//      for (int i = 1; i < n * m+1; i++) {
//         System.out.print(i + " ");
//         if(i%m==0) {
//            System.out.println("");
//         }
//      }
//      sc.close();
//
//   }
//
//}