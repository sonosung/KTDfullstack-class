package d0322;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		
		//data type에 따라 달라지는 연산 우선순위에 따른 결과값의 차이. 
		String str5 = "JDK" + 3 + 3.0; 
		//좌항에 String type "JDK"와 integer type "3" 이 먼저 연산되어, 
		//스트링타입으로 산출되었기 때문에, 뒤에 연결되는 double type "3.0"은
		//문자열로 인식되어, "JDK33.0"가 출력된다.
		String str6 = 3 + 3.0 + "JDK"; //
		//좌항에 제일 먼어 입력된 integer, double type이 먼저 double type으로 연산되어,
		//6.0이란 double data 값이 산출되고, 그 뒤에 "JDK"는 String type 이므로,
		//최종적으로 String type으로 연결되어 연산된다,
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

}
