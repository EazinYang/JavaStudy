package Enum;

public class TestEnum2 {
    public static void main(String[] args){
        Seanson s=Seanson.SPRING;
        System.out.println(s);//自动调用toString
        System.out.println(s.name());
        System.out.println(s.ordinal());

        Seanson[] all=Seanson.values();
        for(int i=0;i<all.length;i++){
            System.out.println(all[i]);
        }
        System.out.println("===================");
        Seanson spring=Seanson.valueOf("SPRING");
        System.out.println(spring);
    }
}
