package Day14;

import Day11.Static.Myclass;

public class TestDefineAnnotation {
    public static void main(String[] args){
        //读取注解
        Class clazz= Myclass.class;
        MyAnnotation my=(MyAnnotation)clazz.getAnnotation(MyAnnotation.class);
        System.out.println(my);
    }
}
