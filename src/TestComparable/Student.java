package TestComparable;

public class Student implements Comparable {
    private String name;
    private int age;
    private int score;
    public Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    @Override
    public int compareTo(Object o) {
        //this与obj比较，this和obj都是学生对象
        Student other=(Student) o;
        if(this.score>other.score){
            return 1;
        }else if(this.score<other.score){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
