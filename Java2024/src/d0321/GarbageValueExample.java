package d0321;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte var1 = 125;
			byte var2 = 125;
			
			for(int i=0;i<5;i++) {  //for 반복문(초기화식,조건식,증감식)
				var1++;				//"var1을 1 증가시키겠다." var1 = var1 + 1
				var2++;				//"var2을 1 증가시키겠다." var1 = var1 + 1
				System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
			}											// "\t"는 탭효과
	}

}
//결과값에서 3번째에 음수가 되는건, overflow현상(저장되는 값 범위 밖에 값이 입력될때)이 일어났기 때문.
//8bit 의 가장 앞 수(MSB)가 1이 되어 음수가 표현됨.
//음수는 2의 보수를 구하면 나옴.(1의보수 + 1)
//1의 보수를 구할땐, 비트를 뒤집는다. -> 마지막 비트에 1을 더한다.