package d0322;

public class SwitchExample2 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		//나올 수 있는 결과값은 8,9,10,11 이 있음!
		System.out.println("현재시간 : " + time);

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default: //case 8,9,10 에 해당하는 값이 없으면 default로 바로 넘어간다.
			System.out.println("외근을 나갑니다.");
			//ex)현재시간 : 11
			//   외근을 나갑니다.
		}
	}
}
// case 아래에 break 포인트가 없으면, 그 아래 