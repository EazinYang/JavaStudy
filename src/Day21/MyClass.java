package Day21;

public class MyClass<T> {
    private T t;//用于当作属性的数据类型
//    private static T t2;/

    public MyClass(T t) {//用于当作方法的数据形参类型
        this.t = t;
    }

    public T getT() {//可以用于返回值的类型
        return t;
    }

    public void test(){
        T t;//局部变量的类型
    }
}
