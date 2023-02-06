package Day19;

import java.util.Arrays;

public class TestMyArraryList {
    public static void main(String[] args){
        //创建一个容器对象
        MyArrayList list=new MyArrayList();

        //往容器中装对象
        list.add(new Apple());
        list.add("hello");
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println("元素的个数："+list.size());
        System.out.println("实际的容量："+list.capacity());

        //获取[5]的元素
        Object obj=list.get(5);
        System.out.println(obj);

        //替换[5]位置的元素
        list.set(5,"张三");
        obj=list.get(5);
        System.out.println(obj);

        list.insert(0,"aa");
        System.out.println("元素的个数："+list.size());
        System.out.println("实际的容量："+list.capacity());

        Object[] all=list.getAll();
        System.out.println(Arrays.toString(all));

        System.out.println("删除后：");
        list.remoeve(2);
        all=list.getAll();
        System.out.println(Arrays.toString(all));

        list.add(null);
        int index=list.indexOf(null);
        System.out.println(null+"在我们的容器的位置："+index);

    }
}
