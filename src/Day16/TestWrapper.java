package Day16;

import TestInterface.Doctor;
import org.junit.Test;

public class TestWrapper {
//    @Test
//    public void test1(){
//        //手动装箱
//        int a=10;//a是基本数据类型
//        Integer aObj=new Integer(a);//把a的数据包装成对象
//        System.out.println(a);
//        System.out.println(aObj);//自动调用toString()
//        System.out.println(aObj.getClass());
//    }
//    @Test
//    public void test2(){
//        //自动装箱
//        int a=10;//a是基本数据类型
//        Integer aObj=a;//把a的数据包装成对象
//        System.out.println(a);
//        System.out.println(aObj);//自动调用toString()
//        System.out.println(aObj.getClass());
//    }
//    @Test
//    public void test3(){
//        Integer i=new Integer(10);
//        int a=i.intValue();//手动拆箱
//        int b=i;//自动拆箱
//    }
//    @Test
//    public void test4(){
//        Integer i=new Integer(1.txt);
//        double j=1.txt.0;
//        System.out.println(i==j);
//        //(1.txt)先把i拆箱为int值(2)然后把i自动类型转换为double(3)比较
//    }
    @Test
    public void test5(){
        int num1=Integer.parseInt("123");//把字符串转换为int
        System.out.println(num1);
//        int num2=Integer.parseInt("123.05");//报错，报NumberFormatException
//        System.out.println(num2);
        double num2= Double.parseDouble("123.05");
        System.out.println(num2);
    }
    @Test
    public void test6(){
        int num1=Integer.valueOf("123");//两边，先转成Integer对象，后拆箱为int
        System.out.println(num1);
        double num2=Double.valueOf("123.01");
        System.out.println(num2);
    }
    @Test
    public void Test7(){
        System.out.println(Integer.toBinaryString(10));//转为二进制
        System.out.println(Integer.toOctalString(10));//转为八进制
        System.out.println(Integer.toHexString(10));//转为十六进制
    }
    @Test
    public void Test8(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    @Test
    public void Test9(){
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('T'));
    }
    @Test
    public void Test10(){
        Integer a=1;
        Integer b=1;
        System.out.println(a==b);//ture，比较的是地址值，a和b比较的是同一个缓存对象

        Integer c=130;
        Integer d=130;
        System.out.println(c==d);//false，比较的是地址值，c和d都是在堆中新建的Integer对象

        Integer e=1;
        Double f=1.0;
//        System.out.println(e==f);无法比较，因为对象比较地址，必须是同一种类型或由父子类关系
    }
}
