package q577;

import java.util.Scanner;

class hoho() {
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	


public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Main main;
	private int[] arr;

	public Main() {

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		while (true) {
			if (num1 > num2) {
				num1 = num1 / 2;
				num2 = num2 * 2;
				System.out.println(num1 + " " + num2);
			} else if (num1 < num2) {
				num1 = num1 * 2;
				num2 = num2 / 2;
				System.out.println(num1 + " " + num2);
			}
			
			break;
			
		}
		sc.close();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main = new Main();
	}

}
