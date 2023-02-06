package Day21;

import org.junit.Test;

import java.util.*;

public class TestCollections {
    @Test
    public void test1(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();

        //此时T是Integer类型
        //<? super T>：可以是Integer或它的父类
        Collections.addAll(list,1,2,3,4);

        //此时T是String类型
        //因为1,2,3,4不满足String类型，所以无法添加
//        Collections.addAll(list2,1.txt,2,3,4);
    }

    @Test
    public void test2(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(9);
        int index=Collections.binarySearch(list,4);
    }

    @Test
    public void test3(){
        ArrayList<Circle> list=new ArrayList<Circle>();
        list.add(new Circle(1.2));
        list.add(new Circle(2.2));
        list.add(new Circle(3.2));
        Collections.binarySearch(list, new Circle(2.2), new Comparator<Graphic>() {
            @Override
            public int compare(Graphic graphic, Graphic t1) {
                if(graphic.getArea()>t1.getArea()){
                    return 1;
                }else if(graphic.getArea()<t1.getArea()){
                    return -1;
                }
                return 0;
            }
        });
    }

    @Test
    public void test4(){
        List<Integer> list= Arrays.asList(1,2,3,4);
        System.out.println(list);

        //说明list是一个只读的集合
//        list.add(5);//报错：java.lang.UnsupportedOperationException
        System.out.println(list.getClass());//class java.util.Arrays$ArrayList不是java.until.ArrayList
    }
}
