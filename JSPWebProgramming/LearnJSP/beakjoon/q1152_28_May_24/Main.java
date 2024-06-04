package q1152_28_May_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		sc.close();
//		System.out.println(sentence);

		char space = ' ';
		int cnt = 0;
		int[] num;

		for (int i = 0; i < sentence.length(); i++) {
			int words = sentence.charAt(i);
			cnt++;
			if (sentence.charAt(0) == space && words == 32 || sentence.charAt(sentence.length() - 1) == space) {

				System.out.println(cnt);
			} else if (sentence.charAt(0) != space && sentence.charAt(sentence.length() - 1) != space) {

				System.out.println(cnt + 1);
			}
		}

	}
}
