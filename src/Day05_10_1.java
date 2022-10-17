public class Day05_10_1 {
    public static void main(String[] args){
        //创建对象
        //类名 对象名=new 类名();
        Day05_10_2 c=new Day05_10_2(1.2);//创建对象的同时给属性赋值
        c.printInfo();

        c.setRdius(2.5);//创建对象之后，修改属性用的
        c.printInfo();

    }
}
