package Singleton;

public class Singleton {
    //将构造器私有话，保证在此类的外部，不能调用本类的构造器
    private Singleton(){}
    //先声明类的引用
    //也需要配合static的方法，用static
    private static Singleton instance=null;
    //设置公共的方法来访问类的实例
    public static Singleton getInstance(){
        //如果类的实例未创建，那些先要创建，然后返回给调用者：本类
        //因此需要static修饰
        if(instance == null){
            instance=new Singleton();
        }
        //若有类的实例，直接返回给调用者
        return instance;
    }
}
