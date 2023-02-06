package Day14_1;

public class Person {
    public static void main(String[] args){
        System.out.println(new Person());
    }

    @Override
    @MyTiger(value="自定义注解")
    public String toString() {
        return "Person{}";
    }
}
