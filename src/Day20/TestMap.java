package Day20;

import org.junit.Test;

import java.util.*;

@SuppressWarnings("all")
public class TestMap {
    @Test
    public void test1(){
        Map map=new HashMap();//HashMap是Map的一个实现类
        map.put("杨泓强","18");
        map.put("崔志恒","20");
        map.put("焦裕禄","30");
        System.out.println(map);//{崔志恒=20, 焦裕禄=30, 杨泓强=18}
        System.out.println(map.containsKey("杨泓强"));//true
        System.out.println(map.containsValue("18"));//true
        System.out.println(map.get("杨泓强"));//18
        map.remove("杨泓强");
        System.out.println(map);//{崔志恒=20, 焦裕禄=30}
    }
    @Test
    public void test2(){
        Map map=new HashMap();
        map.put("杨泓强","18");
        map.put("崔志恒","20");
        map.put("焦裕禄","30");
        Set keys=map.keySet();
        for(Object key:keys){
            System.out.println(key+"->"+map.get(key));//通过key得到value
        }
    }
    @Test
    public void test3(){
        Map map=new HashMap();
        map.put("杨泓强","18");
        map.put("崔志恒","20");
        map.put("焦裕禄","30");
        Collection values=map.values();
        for(Object value:values){
            System.out.println(values);//通过key得到value
        }
    }

    @Test
    public void test4(){
        Map map=new HashMap();
        map.put("杨泓强","18");
        map.put("崔志恒","20");
        map.put("焦裕禄","30");

        Set entrySet=map.entrySet();
        for(Object entry:entrySet){
            System.out.println(entry);//崔志恒=20 焦裕禄=30 杨泓强=18
        }
    }

    @Test
    public void test5(){
        Map map=new HashMap();
        String[] girls={"翠花","凤姐","石榴"};
        map.put("杨泓强",girls);

        ArrayList list=new ArrayList();
        list.add("小红");
        list.add("小明");
        map.put("崔志恒",list);
        System.out.println(map);//{崔志恒=[小红, 小明], 杨泓强=[Ljava.lang.String;@56cbfb61}
    }
}
