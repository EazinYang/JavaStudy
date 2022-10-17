public class Day10_2_9 {
    //这个方法，能够检查所有的动物吃东西是否正常
    //没有多态的话，需要重载很多个
//    public static void check(Day10_2_11 dog){
//        Day10_2_11.eat();
//    }
//    public static void check(Day10_2_12 cat){
//        Day10_2_12.eat();
//    }
    public static void check(Day10_2_10 a){
        a.eat();
    }
    public static void main(String[] args){
        //匿名对象
        check(new Day10_2_11());//隐含了，形参Day10_2_10 a=实参 new Day10_2_11();
        check(new Day10_2_12());//隐含了，形参Day10_2_10 a=实参 new Day10_2_12();
    }
}
