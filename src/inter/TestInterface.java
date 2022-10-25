package inter;

import homework12.C;

public class TestInterface {
    public static void main(String[] args){
        ComparableCircle c1=new ComparableCircle(6);
        ComparableCircle c2=new ComparableCircle(5);
        if(c1.compareTo(c2)>0){
            System.out.println("c1的半径比较大");
        }else if(c1.compareTo(c2)<0){
            System.out.println("c2的半径比较大");
        }else {
            System.out.println("c1，c2的半径一样大" );
        }

        ComparableRectangle r1=new ComparableRectangle(4,5);
        ComparableRectangle r2=new ComparableRectangle(5,6);
        if(r1.compareTo(r2)>0){
            System.out.println("r1的面积比较大");
        }else if(r1.compareTo(r2)<0){
            System.out.println("r2的面积比较大");
        }else {
            System.out.println("r1，r2的面积一样大");
        }
    }
}
