package Day14_homework;

import java.util.Arrays;
import org.junit.Test;

public class MyArrayList implements Touchable{
    private Object[] all=new Object[2];//保存对象，初始化长度2
    private int total;//记录实际存储的对象个数

    /**
     *用于添加一个元素到当前容器中，如果数组all已满，就扩容为原来的2倍
     * @param element Object 元素
     */
    public void add(Object element){
        if(total>=all.length) {
            all = Arrays.copyOf(all, all.length * 2);
        }
        all[total++]=element;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回，否则删除index位置的元素
     * @param index int 索引值
     */
    public void remove(int index){
        if(index<0||index>=total){
            System.out.println("没有这个元素");
            return;
        }
        System.arraycopy(all,index+1,all,index,total-index-1);
        all[total-1]=null;
        total--;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回，否则就替换index位置的元素为value
     * @param index int 索引值
     * @param value Object  元素
     */
    public void set(int index,Object value){
        if(index<0||index>=total){
            System.out.println("没有这个元素");
            return;
        }
        all[index]=value;
    }

    /**
     * 如果index<0或index>=total就打印“没有这个元素”并返回null，否则返回index位置的元素
     * @param index int 索引值
     * @return Object 元素
     */
    public Object get(int index){
        if(index<0||index>=total){
            System.out.println("没有这个元素");
            return null;
        }
        return all[index];
    }

    @Override
    public Selector select() {
        return new MySelector();
    }

    /**
     * MySelector对象，是用来遍历,访问MyArrayList容器中的元素用的
     */
    private class MySelector implements Selector{
        int cursor;//游标

        @Override
        public boolean hasNext() {
            return cursor!=total;
        }

        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}
