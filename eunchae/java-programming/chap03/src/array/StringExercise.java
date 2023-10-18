package array;

import java.util.Scanner;

// 문자열을 읽어서 원하는 문자열이 나타나면 종료하는 프로그램을 완성하시오. 
public class StringExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 10개의 문자열을 저장할 수 있는 문자열 배열 inputs을 선언/생성하시오.
		String inputs[] = new String[10];
		
		
		// 10번 반복하면서 문자열을 읽어서 배열 inputs에 입력하시오.
//		for (int i = 0; i < inputs.length; i++) {
//			inputs[i] = scanner.nextLine();
//		}
		
		for (String input: inputs) {
			input = scanner.nextLine();
		}
		// 모든 입력된 문자열을 화면에 출력하시오. 
		for (String input: inputs) {
			System.out.println(input);
			
		}
		
		// 원하는 문자열의 횟수를 셉니다.
		int count = 0;
		for (String input: inputs) {
			if (input.equals("d")) {
//			if (input==("d")) {
				count++;
			};
		}
		System.out.println("Count =" + count);
	}

}
