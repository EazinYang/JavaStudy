package Day18;

import org.junit.Test;

public class TestStringBuilderBuffer {
    @Test
    public void test01(){
        StringBuilder s=new StringBuilder();
        s.append("hello").append(true).append('a').append(12);
        System.out.println(s);//hellotruea12
    }
    @Test
    public void test02(){
        StringBuilder s=new StringBuilder("helloworld");
        s.insert(5,"java");
        s.insert(5,"chailinyan");
        System.out.println(s);//hellochailinyanjavaworld
    }
    @Test
    public void test03(){
        StringBuilder s=new StringBuilder("helloworld");
        s.delete(1,3);
        System.out.println(s);//hloworld
        s.deleteCharAt(4);
        System.out.println(s);//hlowrld

    }
    @Test
    public void test04(){
        StringBuilder s=new StringBuilder("helloworld");
        s.reverse();
        System.out.println(s);//dlrowolleh
    }
    @Test
    public void test05(){
        StringBuilder s=new StringBuilder("helloworld");
        s.setCharAt(0,'1');
        System.out.println(s);//1elloworld
    }
    @Test
    public void test06(){
        StringBuilder s=new StringBuilder("helloworld");
        s.setLength(30);
        System.out.println(s);
    }
}
