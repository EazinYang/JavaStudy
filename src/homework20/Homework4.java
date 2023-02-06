package homework20;

import homework13.A;

import java.util.*;

@SuppressWarnings("all")
public class Homework4 {
    public static void main(String[] args){
        String[] nums = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        String[] colors = { "方片", "梅花", "红桃", "黑桃" };

        ArrayList list = new ArrayList(); // 存储54章牌的索引[0,53]
        HashMap map = new HashMap(); // 存储索引和扑克牌
        int index = 1; // 索引的开始值
        for (String num : nums) {
            for (String color : colors) {
                map.put(index, color.concat(num)); // 将索引和扑克牌添加到HashMap中
                list.add(index); // 将索引添加到ArrayList集合中
                index++;
            }
        }
        map.put(index, "小王");
        list.add(index);
        index++;
        map.put(index, "大王");
        list.add(index);
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        TreeSet left = new TreeSet();
        TreeSet right = new TreeSet();
        TreeSet me = new TreeSet();
        TreeSet up = new TreeSet();
        TreeSet lastCards = new TreeSet();
        for (int i = 0; i < 13; i++) {
            right.add(list.remove(0));
            left.add(list.remove(0));
            me.add(list.remove(0));
            up.add(list.remove(0));
        }
        lastCards.addAll(list);

        // 看牌
        lookPoker("左边玩家", left, map);
        lookPoker("右边玩家", right, map);
        lookPoker("上边玩家", up, map);
        lookPoker("我", me, map);
        lookPoker("底牌", lastCards, map);
    }

    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> map) {
        System.out.println(name + "的牌是:");
        for (Integer index : ts) {
            System.out.print(map.get(index) + " ");
        }
        System.out.println();
    }
}
