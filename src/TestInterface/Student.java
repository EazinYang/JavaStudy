package TestInterface;

public class Student {
    private String name;
    private int age;
    private int score;
    public Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    public int getAge() {
        return age;
    }
}
