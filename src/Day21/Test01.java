package Day21;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args){
        ArrayList<String> student=new ArrayList<String>();
        student.add("张三");
        student.add("李四");
        student.add("王五");
        for(String name:student){
            System.out.println(name);
        }
        Iterator<String> iterator=student.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
