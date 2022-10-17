package Singleton;

public class Single {
    //private的构造器，不能在类的外部创建该类的对象
    private Single(){
    }
    //私有的，只能在类的内部访问
    private static Single onlyone=new Single();
    //getSingle()为static，不用创建对象，即可访问
    public static Single getSingle(){
        return onlyone;
    }
}
