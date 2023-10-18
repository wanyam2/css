package reference;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		boolean diff = strVar1 == strVar2; // 두 변수에 들은 값이 같은가?
		System.out.println(diff);
		
		boolean diffContent = strVar1.equals(strVar2);
		System.out.println(diffContent);
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		boolean diff2 = strVar2 == strVar3;
		System.out.println(diff2);
		
		boolean diffContent2 = strVar3.equals(strVar4); // 왼쪽의 문자열과 괄호 안의 문자열을 비교한다. 참조값을 따라가서 실제 내용을 비교한
		System.out.println(diffContent2);
		
		boolean diffContent3 = strVar1.equals(strVar4);
		System.out.println(diffContent3);
		
		
		if (strVar3.equals(strVar4)) {
			System.out.println("[1]strVar3와 strVar4는 문자열이 같음 (같은 내용이다)");
		}
		
		
		
		if (strVar3 == strVar4) {
			System.out.println("[2]strvar3와 strVar4는 문자열이 같음 (같은 내용이다)");
		} // 같은 객체가 아니라서 출력이 되지 않
	}

}
