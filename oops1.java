public class oops1 {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    

class Student extends Person {
    private int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Sneha", 22, 101);

        s1.display();

        System.out.println(s1.getName());
    }
}
