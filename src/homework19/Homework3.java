package homework19;

import java.lang.reflect.Array;
import java.util.*;

public class Homework3 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] hua = {"黑桃","红桃","方片","梅花"};
        String[] wang = {"大王","小王"};

        ArrayList list = new ArrayList();
        for (int i = 0; i < dian.length; i++) {
            for (int j = 0; j < hua.length; j++) {
                list.add(hua[j]+dian[i]);
            }
        }
        for (int i = 0; i < wang.length; i++) {
            list.add(wang[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
            if((i+1)%10==0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("发牌：");

        Random rand = new Random();
        ArrayList one = new ArrayList();
        for (int i = 0; i < 11; i++) {
            one.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList two = new ArrayList();
        for (int i = 0; i < 11; i++) {
            two.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList three = new ArrayList();
        for (int i = 0; i < 11; i++) {
            three.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList four = new ArrayList();
        for (int i = 0; i < 11; i++) {
            four.add(list.remove(rand.nextInt(list.size())));
        }
        System.out.println("第1个人：" + one);
        System.out.println("第2个人：" + two);
        System.out.println("第3个人：" + three);
        System.out.println("第4个人：" + four);
        System.out.println("剩余：" + list);
    }
}
