public class Day05_5 {
    public static void main(String[] args){//args是局部变量
        String ming="张三";//ming是局部变量
        int nian=23;//nian是局部变量

        Day05_6 s1=new Day05_6(); //s1局部变量
        s1.name=ming;   //s1.name不是在这里声明，只是使用它
        s1.age=nian;
    }
}
