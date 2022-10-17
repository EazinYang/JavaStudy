package superThis;

public class Student extends Person{
    int id;
    int score;

    public Student(String name,int age,int id,int score){
        super(name,age);
        this.id=id;
        this.score=score;
    }

    public String say(){
        return super.say()+",ID："+this.id+"，成绩："+this.score;
    }
}
