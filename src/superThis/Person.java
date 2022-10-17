package superThis;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String say(){
        return "姓名："+this.name+"，年龄："+this.age;
    }
}
