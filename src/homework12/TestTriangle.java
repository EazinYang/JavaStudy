package homework12;

public class TestTriangle {
    public static void main(String[] args){
        Triangle t1=new Triangle(2,3,3);
        System.out.println(t1.toString());
        Triangle t2=new Triangle();
        t2.setA(2);
        t2.setB(2);
        t2.setC(3);
        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));
    }
}
