package d0322;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
//Math 클래스!. Math.random 은 0.0이상, 1.0 미만의 난수(무작위 숫자)를 더블형태로 Return(method return임)함.
		switch(num) {
		//(num) 자리에 숫자가 주어지면, case를 순서대로 수행함.
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; //switch 바깥으로 나가는 역할을 함.
		case 2:
			System.out.println("2번이 나왓습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
