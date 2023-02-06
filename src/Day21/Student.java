package Day21;
/*
自定义一个泛型类：
定义一个"特殊"的学生类，学生类包含两个属性：姓名，成绩
此时成绩的情况很复杂：
语文老师在表示学生时：成绩等级为：优秀、良好、及格、不及格
数学老师在表示学生时：成绩等级为：89.5...
英语老师在表示学生时：成绩等级为：A,B,C,D...
 */
//<T>：泛型形参
//T在这个Student当中就是Score的类型，凡是需要表示score的类型的地方都用T
public class Student<T> {
    private String name;
    private T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public T getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", score=" + score + '}';
    }
}
