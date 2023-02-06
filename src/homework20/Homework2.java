package homework20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Homework2 {
    public static void main(String[] args){
        HashMap map = new HashMap();

        ArrayList wangfei = new ArrayList();
        wangfei.add("《红豆》");
        wangfei.add("《传奇》");
        wangfei.add("《容易受伤的女人》");
        map.put("王菲", wangfei);
        
        ArrayList zxy = new ArrayList();
        zxy.add("《一路上有你》");
        zxy.add("《吻别》");
        zxy.add("《一千个伤心的理由》");
        map.put("张学友", zxy);

        Set entrySet = map.entrySet();
        for (Object object : entrySet) {
            System.out.println(object);
        }
    }
}
