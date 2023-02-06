package homework19;

import java.util.*;

public class Homework9 {
    @SuppressWarnings("all")
    public static void main(String[] args){
//        Collection list=new ArrayList();
//        Random rand=new Random();
//        while (list.size()<7){
//            String s="红色球"+(rand.nextInt(32)+1.txt);
//            if(!list.contains(s)){
//                list.add(s);
//            }
//        }
//        list.add("蓝色球"+(rand.nextInt(15)+1.txt));
//        System.out.println(list);
        TreeSet red = new TreeSet();
        Random rand = new Random();
        while(red.size()<6){
            red.add(rand.nextInt(33)+1);
        }
        ArrayList list = new ArrayList();
        for (Object object : red) {
            list.add(object);
        }
        list.add(rand.nextInt(16)+1);
        System.out.println("双色球所有号码：" + list);

        System.out.print("红色号码：");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("蓝色号码：" + list.get(list.size()-1));
    }
}
