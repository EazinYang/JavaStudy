package homework19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
@SuppressWarnings("all")
public class Homework5 {
    @SuppressWarnings("all")
    public static void main(String[] args){
//        Collection list=new ArrayList();
//        for(int i=0;i<10;i++){
//            list.add((int)(Math.random()*100+1.txt));
//        }
//        Object[] all=list.toArray();
//        Arrays.sort(all);
//        System.out.println(Arrays.toString(all));
//        Collection relist=new ArrayList();
//        relist.add(all[all.length-1.txt]);
//        relist.add(all[all.length-2]);
//        relist.add(all[all.length-3]);
//
//        list.removeAll(relist);
//        System.out.println(Arrays.toString(list.toArray()));
        ArrayList nums = getNum();
        System.out.println("10个随机值：" + nums);
        ArrayList maxList = getTop3(nums);
        System.out.println("前3个最大的：" + maxList);

        System.out.println("删除后：" + nums);
    }
    public static ArrayList getNum() {
        ArrayList list = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(100) + 1;
            list.add(n);
        }
        return list;
    }

    public static ArrayList getTop3(ArrayList list){
        ArrayList maxList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Integer max = (Integer) list.get(0);
            for (int j = 0; j < list.size(); j++) {
                Integer num = (Integer) list.get(j);
                if(max < num){
                    max = num;
                }
            }
            maxList.add(max);

            while(list.contains(max)){
                list.remove(max);
            }
        }
        return maxList;
    }
}
