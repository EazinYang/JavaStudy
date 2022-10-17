public class Day10_2_1 {
    public static void main(String[] args){
        //本态引用
        Day10_2_2 p=new Day10_2_2();
        Day10_2_3 w=new Day10_2_3();
        Day10_2_4 m=new Day10_2_4();

        //多态引用
        Day10_2_2 p2=new Day10_2_3();
        p2.eat();
        p2.walk();
//        p2.shop();//Day10_2_2没有shop()
//        System.out.println(p2.name);//Day10_2_2没有name
    }
}
