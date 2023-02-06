package homework21;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework3 {
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        ArrayList<String> wangfei = new ArrayList<>();
        wangfei.add("《红豆》");
        wangfei.add("《传奇》");
        wangfei.add("《容易受伤的女人》");
        map.put("王菲", wangfei);


        ArrayList<String> zxy = new ArrayList<>();
        zxy.add("《一路上有你》");
        zxy.add("《吻别》");
        zxy.add("《一千个伤心的理由》");
        map.put("张学友", zxy);

        Set<Map.Entry<String, ArrayList<String>>> entrySet = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            System.out.println(entry);
        }
    }
}
