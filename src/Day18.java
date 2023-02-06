import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Day18 {
    @Test
    public void test01() throws UnsupportedEncodingException {
        String str1="a";
        byte[] bytes1=str1.getBytes();
        System.out.println(Arrays.toString(bytes1));//[97]
        String strBytes1=new String(bytes1);
        System.out.println(strBytes1);//a

        String str2="abc";
        byte[] bytes2=str2.getBytes();
        System.out.println(Arrays.toString(bytes2));//[97, 98, 99]
        String strBytes2=new String(bytes2,"utf-8");
        System.out.println(strBytes2);//abc

        String str3="尚硅谷";
        byte[] bytes3=str3.getBytes();
        System.out.println(Arrays.toString(bytes3));//[-27, -80, -102, -25, -95, -123, -24, -80, -73]

        String str4="尚硅谷";
        byte[] bytes4=str4.getBytes("GBK");
        System.out.println(Arrays.toString(bytes4));//[-55, -48, -71, -24, -71, -56]
    }

    @Test
    public void test02(){
        String name="黎明";
        if(name.startsWith("张")){
            System.out.println("张家人");
        }else {
            System.out.println("不是张家人");
        }

        String fileName="Hello.clas";
        if(fileName.endsWith(".java")){
            System.out.println("java的源文件");
        }else {
            System.out.println("java的字节码文件");
        }
    }

    @Test
    public void test03(){
        String str1="123.45";
        if(str1.contains(".")){
            System.out.println("是小数");
        }

        int index1=str1.indexOf(".");
        System.out.println(index1);//3

        String str2="123.45.";
        int index2=str2.indexOf(".");
        System.out.println(index2);//3
        int index3=str2.lastIndexOf(".");
        System.out.println(index3);//6
    }

    @Test
    public void test04(){
        String fileName="Hello.java.txt";
        int index=fileName.lastIndexOf(".");
        String sub1=fileName.substring(index);
        System.out.println(sub1);//.txt

        String str="helloworldjava";
        String sub2=str.substring(2,6);
        System.out.println(sub2);//llow
    }

    @Test
    public void test05(){
        String str1="123456789";
        //判断他是否全部由数字组成，并且第1位不能是0，长度为9
        //第一位数字是[1.txt-9]
        //接下来8位是[0-9]{8}+
        boolean flag1=str1.matches("[1-9][0-9]{8}+");
        System.out.println(flag1);//true

        String str2="12345";
        //在正则中\是表示转义
        //同时在java中\也是转义
        boolean flag2= str1.matches("\\d");
        System.out.println(flag2);
    }

    @Test
    public void test06(){
        String str1="中国共产党是执政党，中国共产党是领导当";
        str1=str1.replace("共产党","***");
        System.out.println(str1);//中国***是执政党，中国***是领导当

        String str2="hello244world.java;887";
        //把非字母去掉
        str2=str2.replaceAll("[^a-zA-Z]","");
        System.out.println(str2);//helloworldjava
    }

    @Test
    public void test07(){
        String str1="Hello World java atguiug";
        String[] all1=str1.split(" ");
        System.out.println(Arrays.toString(all1));//[Hello, World, java, atguiug]

        String str2="1Hello2World3java4atguiug";
        str2=str2.replaceAll("^\\d|\\d$","");
        String[] all2=str2.split("\\d");
        System.out.println(Arrays.toString(all2));//[Hello, World, java, atguiug]

        String str3="张三.23|李四.24|王五.25";
        String[] all3=str3.split("\\|");

    }
}
