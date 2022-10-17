public class Day09 {
    private double radius;

    public Day09(){
        //希望该字符串不管在创建有参还是无参对象时都打印，可通过this()输出
        System.out.println("一个圆对象被创建");
    }

    public Day09(double radius){//局部变量
        this();//代表无参构造
        this.radius=radius;//给成员变量private double radius赋值
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public void printInfo(){
        System.out.println("半径："+this.radius+"，面积："+this.getArea());
    }
}
