package Day21;

import javax.swing.text.html.parser.Entity;
import java.util.*;

@SuppressWarnings("all")
public class Test02 {
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
        ArrayList<String> group1=new ArrayList<String>();
        group1.add("杨泓强");
        group1.add("苏海波");
        map.put("杨泓强",group1);

        ArrayList<String> group8=new ArrayList<String>();
        group8.add("崔志恒");
        group8.add("甄玉禄");
        group8.add("杜冠军");
        map.put("崔志恒",group8);

        System.out.println("遍历所有的组长：");
        Set<String> keySet=map.keySet();
        for(String zuZhang:keySet){
            System.out.println(zuZhang);
        }

        System.out.println("遍历所有的组员：");
        Collection<ArrayList<String>> values=map.values();
        for(ArrayList<String> group:values){
            System.out.println(group);
        }

        System.out.println("遍历每一组的情况：");
        Set<Map.Entry<String,ArrayList<String>>> entrySet=map.entrySet();
        for(Map.Entry<String,ArrayList<String>> entry:entrySet){
            System.out.println(entry);
        }
    }
}
