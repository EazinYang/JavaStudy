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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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
            double p=getPiremeter()*0.5;
            return p*(p-this.a)*(p-this.b)*(p-this.c);
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
