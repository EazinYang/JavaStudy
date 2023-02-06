package homework20;

import homework13.A;

import java.util.*;

@SuppressWarnings("all")
public class Homework3 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("北京市", Arrays.asList("北京市"));
        map.put("海南省", Arrays.asList("海口市","三亚市"));
        map.put("浙江省", Arrays.asList("绍兴市","温州市","湖州市","嘉兴市","台州市",
                "金华市","舟山市","衢州市","丽水市"));

        Set entrySet = map.entrySet();
        for (Object object : entrySet) {
            System.out.println(object);
        }
    }
}
