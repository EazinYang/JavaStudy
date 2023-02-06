package homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

@SuppressWarnings("all")
public class Homewrok7 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            list.add((char)(rand.nextInt(26)+97)+"");
        }
        System.out.println(list);
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("x:"+listTest(list, "x"));
    }

    public static int listTest(Collection list, String string) {
        int count = 0;
        for (Object object : list) {
            if(string.equals(object)){
                count++;
            }
        }
        return count;
    }
}
