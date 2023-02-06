package Day14_homework;

public class TestMyArrayList {
    public static void main(String[] args){
        MyArrayList list=new MyArrayList();
        list.add("小明");
        list.add("小红");
        list.add("小军");
        list.remove(1);
        Selector select=list.select();
        while(select.hasNext()){//判断游标是否等于total
            Object next=select.next();//如果不等于就返回对象，
            System.out.println(next);
        }
        list.set(1,"李四");
        Object object=list.get(1);
        System.out.println(object);
    }
}
