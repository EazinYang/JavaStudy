package TestInterface;

import java.util.Arrays;
import java.util.Comparator;

public class TestAnonymousInner {
    public static void main(String[] args){
//        //声明一个Object的子类，匿名子类
//        //并在子类中声明一个方法public void test()打印"hello匿名内部类"
//        //使用1：赋值给变量
//        Object obj1=new Object(){
//            public void test(){
//                System.out.println("hello匿名内部类1");
//            }
//        };
//        System.out.println(obj1.getClass());
//        System.out.println(obj1.toString());
//        //使用2：直接调用方法
//        new Object(){
//            public void test(){
//                System.out.println("hello匿名内部类2");
//            }
//        }.test();
        //声明一个比较器类型，比较两个元的半径大小
        //把一个comparator接口的匿名实现类对象赋值Comparator
//        Comparator c=new Comparator(){
//            @Override
//            public int compare(Object o, Object t1) {
//                Circle c1=(Circle)o;
//                Circle c2=(Circle)t1;
//                if(c1.getRadius()>c2.getRadius()){
//                    return 1.txt;
//                }else if(c1.getRadius()<c2.getRadius()){
//                    return -1.txt;
//                }
//                return 0;
//            }
//        };
//        System.out.println(c.compare(new Circle(1.txt),new Circle(2)));

        Circle[] all=new Circle[3];
        all[0]=new Circle(3);
        all[1]=new Circle(2);
        all[2]=new Circle(1);
        Arrays.sort(all,new Comparator(){//Arrays.sort(all,c)也是可行的
            @Override
            public int compare(Object o, Object t1) {
                Circle c1=(Circle)o;
                Circle c2=(Circle)t1;
                if(c1.getRadius()>c2.getRadius()){
                    return 1;
                }else if(c1.getRadius()<c2.getRadius()){
                    return -1;
                }
                return 0;
            }
        });
        for(int i=0;i<all.length;i++){
            System.out.println(all[i].toString());
        }
    }
}
