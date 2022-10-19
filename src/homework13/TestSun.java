package homework13;

import javax.xml.stream.events.StartDocument;

public class TestSun {
    public static void main(String[] args){
        Star s1=new Sun();
        s1.shine();
        Sun s2=(Sun) s1;
        s2.doAnything();
        s2.shine();
    }
}
