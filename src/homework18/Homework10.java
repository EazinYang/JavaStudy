package homework18;

import org.junit.Test;

import java.math.BigInteger;

public class Homework10 {
    public static void main(String[] args){

    }

    @Test
    public void test01(){
        String str = "23.23456789";
        System.out.println("原数字：" + str);

        str = new Handleable() {
            @Override
            public String handleString(String num) {
                //查找小数点.位置
                int index = num.indexOf(".");
                if(index != -1){
                    num = num.substring(0, num.indexOf("."));
                }
                return num;
            }
        }.handleString(str);
        System.out.println("取整后：" + str);
    }
    @Test
    public void test02(){
        String str="123.214";
        str=new Handleable(){

            @Override
            public String handleString(String num) {
                return ""+Math.round(Double.parseDouble(num));
            }
        }.handleString(str);
        System.out.println("保留4位小数，四舍五入后：" +str);
    }
}
