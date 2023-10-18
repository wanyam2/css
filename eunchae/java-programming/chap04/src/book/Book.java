package book;
public class Book {
	String title;
	String author;
	
	void setMember(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) { // 생성자
//		this(t, "작자미상");
		setMember (title, "작자미상");
		System.out.println("Book1 생성자 호출");
//		title = t;
//		author = "작자미상";
	}
	public Book(String title, String author) { // 생성자
		setMember(title, author);
		System.out.println("Book2 생성자 호출");
//		title = t;
//		author = a;
	}
	
	public static void main(String [] args) {
		Book javaBook = new Book("Java", "황기태");
				// 생성자 Book(String t, String a) 호출

		Book bible = new Book("Bible");
						// 생성자 Book(String t) 호출

	}
}