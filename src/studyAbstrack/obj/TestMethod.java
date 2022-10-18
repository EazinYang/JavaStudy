package studyAbstrack.obj;

public class TestMethod {
    public static void main(String[] args){
//        Father f=new Son();
//        Class c=f.getClass();
//        System.out.println(c);
//        Object obj=12;
//        System.out.println(obj.getClass());
//        String s1="Aa";
//        String s2="BB";
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
        Circle c1=new Circle();
        c1.radius=1;

        Circle c2=new Circle();
        c2.radius=1;

        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));

        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true，因为String类型重写了equals
        String s1="heelo";//因为s1和s2指向同一个常量对象，地址值是同一个
        String s2="heelo";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
    }
}
