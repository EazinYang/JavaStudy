package inter;

import java.util.Random;

public class Rectangle {
    private double longs;
    private double wide;

    public Rectangle(double longs,double wide){
        this.longs=longs;
        this.wide=wide;
    }

    public double getArea(){
       return this.longs*this.wide;
    }
}
