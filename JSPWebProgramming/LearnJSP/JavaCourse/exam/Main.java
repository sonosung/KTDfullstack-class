package exam;

import java.util.Scanner;

public class Main<StuData> {

	private static Scanner sc = new Scanner(System.in);
	private static Main main;
	private String name;
	private String school;
	private int grade;

	public Main() {
	}

	public String getName() {
		return sc.next();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return sc.next();
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return sc.nextInt();
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {

		main = new Main();

		System.out.println("name : " + main.getName());
		System.out.println("School : " + main.getSchool());
		System.out.println("grade : " + main.getGrade());
		sc.close();
	}

}