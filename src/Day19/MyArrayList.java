package Day19;

import java.util.Arrays;

/*
MyArrayList我们自己设计的一种数据结构，一种逻辑结构，当别人使用我这个MyArrayList的对象时，就是一个容器对象
可以用来装对象
*/
public class MyArrayList {
    //为什么使用Object，因为只是说这个容器是用来装对象，但是不知道用来装什么对象
    private Object[] data;
    private int total;

    public MyArrayList(){
        data=new Object[5];
    }

    public void add(Object obj){
//如果data满了就扩容
        checkCapacity();
        data[total++]=obj;
    }

    private void checkCapacity() {
//检查是否需要扩容，需要就扩容2倍
        if(total>=data.length){
            data= Arrays.copyOf(data,data.length*2);
        }
    }

    //返回实际元素的个数
    public int size(){
        return total;
    }

    //返回数组的实际容量
    public int capacity(){
        return data.length;
    }

    public Object get(int index){
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= total) {
            throw new IndexOutOfBoundsException(index + "越界");
        }
    }

    //替换[index]位置的元素
    public void set(int index,Object value){
        checkIndex(index);
        data[index]=value;
    }

    //在[index]位置插入一个元素value
    public void insert(int index,Object value){
        checkIndex(index);
        checkCapacity();
        System.arraycopy(data,index,data,index+1,total-index);
        data[index]=value;
        total++;
    }

    //返回所有实际存储的元素
    public Object[] getAll(){
        //返回total个元素
        return  Arrays.copyOf(data,total);
    }

    //删除[index]位置的元素
    public void remoeve(int index){
        checkIndex(index);
        System.arraycopy(data,index+1,data,index,total-index-1);
        data[total-1]=null;
        total--;
    }

    //查询某个元素的下标
    public int indexOf(Object obj){
        if(obj==null){
            for(int i=0;i<total;i++){
                if(data[i]==null){
                    return i;
                }
            }
        }else {
            for(int i=0;i<total;i++){
                if(obj.equals(data[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    //删除数组中的某个元素
    //如果有重复，只删除第一个
    public void remove(Object obj){
        //先查询obj的下标
        //如果存在，调用remove(index)删除就可以
        int index=indexOf(obj);
        if(index!=-1){
            remoeve(index);
        }
        throw new RuntimeException(obj+"不存在");
    }

    //替换某个元素
    public void set(Object old,Object value){
        //查询old的[index]
        //如果存在调用set(index,value)
        int index=indexOf(old);
        if(index!=1){
            set(index,value);
        }
    }
}
