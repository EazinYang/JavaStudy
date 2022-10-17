public class Day10_2_13 {
    public static void main(String[] args) {
        //向上转型
        Day10_2_14 p = new Day10_2_15();//多态引用
        //一旦吧Day10_2_15对象向上转型为Day_2_14类型后，就只能调用父类有的方法
        p.eat();
        p.walk();

        //向下转型
        //想要把这里调用Day_2_15持有的方法时
        //编译时，p是Day10_2_14类型，那么编译不通过
        //因为在java中，认为父类的概念范围>子类的概念范围
        //Day10_2_15 m=p; //编译报错
        Day10_2_15 m = (Day10_2_15) p;
        m.shop();

        Day10_2_14 p2=new Day10_2_14();
//        Day10_2_15 m2=(Day10_2_15)p2;//报错，ClassCastException：类型转换异常
//        m2.shop();

        Day10_2_14 p3=new Day10_2_16();
//        Day10_2_15 m3=(Day10_2_15)p3;//报错，ClassCastException：类型转换异常
//        m3.shop();
    }
}
