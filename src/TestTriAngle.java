public class TestTriAngle {
    public static void main(String[] args){
        TriAngle t=new TriAngle();
        t.setBase(15.5);
        t.setHeight(16.5);
        double area=0.5*t.getBase()*t.getHeight();
        System.out.println("底："+t.getBase()+"，高："+t.getHeight()+"的三角形面积为："+area);
    }
}
