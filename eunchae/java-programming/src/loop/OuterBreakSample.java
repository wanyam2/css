package loop;

public class OuterBreakSample {
	public static void main(String[] args) {
		
		
		all: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 2) {
					break all; // 반복 종료
				}
				System.out.println(i + " "+ j);
				
			}
			System.out.println("for(j) end");
		}
	}

}
