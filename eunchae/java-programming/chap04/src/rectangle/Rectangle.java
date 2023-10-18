package rectangle;

// 가로(width), 세로(height) 속성을 만들고
// 면적을 구하는 함수(메소드) (getArea) 를 생성하시오

public class Rectangle {
	
	int width, height;
	
	int getArea() {
		return width * height;
	}
	
	public static void main (String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = 4;
		rectangle.height = 5;
		
		System.out.println("사각형의 면적은 " + rectangle.getArea());
		
	}

}
