package homework12;

import java.util.Objects;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(){

    }

    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void setA(double a){
        this.a=a;
    }

    public double getA(){
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public String toString(){
        return "三角形的三边长分别为："+this.a+"，"+this.b+"，"+this.c+"，周长："+getPiremeter()+"，面积："+getArea();
    }

    @Override
    public boolean equals(Object o) {
        //比较当前对象this和指定对象o的地址值，如果地址值相同，就直接返回ture，后面就不看了
        if (this == o) return true;

        //如果o是null，说明是空对象
        //因为当前对象this一定是非空的，因为如果为空的话，早就报空指针异常
        //非空对象与空对象equals，一定是false
        //获取当前对象的运行类型，和o对象的运行时类型，看是否一致，如果不一致，就直接返回false
        if (o == null || getClass() != o.getClass()) return false;

        //把o对象向下转型
        //这里没有对o对象进行instanceof判断是因为上面确定了this和o都是三角形类型的对象
        //为什么要强制？因为o编译时类型是Object类型，是无法调用o.a，o.b，o.c等
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public double getArea(){
        if(a+b>c || a+c>b || b+c>a){
            double p=(this.a+this.b+this.c)/2;
            return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
        }else {
            return 0;
        }
    }

    public double getPiremeter(){
        if(a+b>c || a+c>b || b+c>a) {
            return this.a + this.b + this.c;
        }else {
            return 0;
        }
    }
}
