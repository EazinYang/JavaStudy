package superThis;

public class Test {
    public static void main(String[] args){
        Person p=new Person("小红",18);
        System.out.println(p.say());

        Student s=new Student("小明",20,1,100);
        System.out.println(s.say());
    }
}
