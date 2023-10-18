package student;

public class Student {
    private String name;
    private int age;
    private String food;
    

    public Student(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void print() {
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("좋아하는 음식: " + this.food);
    }
}
