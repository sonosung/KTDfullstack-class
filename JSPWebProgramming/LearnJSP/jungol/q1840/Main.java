package q1840;
//치즈 문제.
//세로 y, 가로 x 의 판이 만들어진다.
//치즈는 1, 공기는 0.
//치즈 1 옆에 0이 있으면

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		
		int width = Integer.parseInt(n);
		int height = Integer.parseInt(m);
		int num = width * height;
		int[] arr = new int[num];
		int rectangle = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < width; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < width; j++) {
			System.out.print(j);
			if(j % width == 0) {
				
				System.out.println("");
			}
			
				
			
		}
		System.out.print(sb);
		sc.close();
	}

}