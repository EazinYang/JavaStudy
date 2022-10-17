package JiCheng;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder c=new Cylinder();
        c.setRadius(5.5);
        c.setLength(10);
        System.out.println("圆柱的体积为："+c.findVolume());
    }
}
