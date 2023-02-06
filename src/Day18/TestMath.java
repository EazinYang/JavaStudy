package Day18;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestMath {
    @Test
    public void test01(){
        System.out.println(Math.PI);//3.141592653589793
        System.out.println(Math.sqrt(9));//3.0
        System.out.println(Math.pow(2,8));//2的8次方,256.0
        System.out.println(Math.max(2,9));//9
        System.out.println(Math.min(2,9));//2
    }
    @Test
    public void test02(){
        System.out.println(Math.ceil(2.1));//进一法
        System.out.println(Math.floor(2.1));//退一法
        System.out.println(Math.round(2.1));//四舍五入

        System.out.println(Math.ceil(2.6));//进一法
        System.out.println(Math.floor(2.6));//退一法
        System.out.println(Math.round(2.6));//四舍五入

        System.out.println(Math.ceil(-2.1));//进一法
        System.out.println(Math.floor(-2.1));//退一法
        System.out.println(Math.round(-2.1));//四舍五入

        System.out.println(Math.ceil(-2.6));//进一法
        System.out.println(Math.floor(-2.6));//退一法
        System.out.println(Math.round(-2.6));//四舍五入
    }
    @Test
    public void test03(){
        BigInteger big1=new BigInteger("72345678912345678912345678");
        BigInteger big2=new BigInteger("42345678912345678912345678");
        System.out.println("和："+big1.add(big2));//和：114691357824691357824691356
        System.out.println("减："+big1.subtract(big2));//减：30000000000000000000000000
        System.out.println("乘："+big1.multiply(big2));//乘：306352688991784788757216878058832516293400416527968
        System.out.println("除："+big1.divide(big2));//除：1.txt

        BigDecimal big3=new BigDecimal("72.345678912345678912345678");
        BigDecimal big4=new BigDecimal("4.2345678912345678912345678");
        System.out.println("和："+big3.add(big4));
        System.out.println("减："+big3.subtract(big4));
        System.out.println("乘："+big3.multiply(big4));
        System.out.println("除："+big3.divide(big4));//除不尽报异常
    }
}

