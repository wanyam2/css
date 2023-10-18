package circle;

public class Circle {	//파스칼 케이스, pascal case
	// 멤버 변수, 속성
	int radius;
	String name;
	
	// 멤버 함수, 메소드
	double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	public Circle() { // 디폴트 생성자
		
	}
	// 메소드 오버로딩
	
//	public Circle() { // 디폴트 생성자
//		radius = 1;
//		name = "no name";
//	}
	
	public Circle(int r, String name) {
		this.radius = r;
		this.name = name;
	}
	
	public Circle(int r) {
		this.radius = r;
		this.name = "no name";
	}
}
