package Day20;

import org.junit.Test;

import java.util.Stack;
@SuppressWarnings("all")
public class TestListImpl {
    @Test
    public void test1(){
        Stack stack=new Stack();
        stack.add("1.txt");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        System.out.println(stack.peek());//4
    }
    @Test
    public void test2(){
        Stack stack=new Stack();
        stack.add("1.txt");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1.txt
        System.out.println(stack.pop());//java.util.EmptyStackException
    }
    @Test
    public void test3(){
        Stack stack=new Stack();
        stack.push("1.txt");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack.peek());//4
    }

}
